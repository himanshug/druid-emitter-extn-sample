package io.druid.sample.emitter;

import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.databind.Module;
import com.google.inject.Binder;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import com.metamx.common.logger.Logger;
import com.metamx.emitter.core.Emitter;

import io.druid.guice.JsonConfigProvider;
import io.druid.guice.ManageLifecycle;
import io.druid.initialization.DruidModule;

public class SampleEmitterModule implements DruidModule
{
  private static Logger log = new Logger(SampleEmitterModule.class);

  @Override
  public void configure(Binder binder)
  {
    //This will allow all properties prefixed with druid.emitter.sample_logging be bound to
    //SampleEmitterConfig class
    JsonConfigProvider.bind(binder, "druid.emitter.sample_logging", SampleEmitterConfig.class);
  }

  @Override
  public List<? extends Module> getJacksonModules()
  {
    return Collections.EMPTY_LIST;
  }

  @Provides
  @ManageLifecycle
  @Named("sample_logging")
  public Emitter getEmitter(SampleEmitterConfig config)
  {
    log.info("Creating Sample Logging Emitter");
    return new SampleLoggingEmitter(config.getLoggerName());
  }
}
