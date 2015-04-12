package io.druid.sample.emitter;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SampleEmitterConfig
{
  @JsonProperty
  @NotNull
  private String loggerName;

  public String getLoggerName() {
    return loggerName;
  }
}

