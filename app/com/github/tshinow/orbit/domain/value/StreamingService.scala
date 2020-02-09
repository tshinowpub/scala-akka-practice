package com.github.tshinow.orbit.domain.value

sealed abstract class StreamingService(val value: String)

case object Youtube extends StreamingService("1")
case object Twitch extends StreamingService("2")
