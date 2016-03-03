package fr.hmil.scalahttpclient.node.net

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
trait SocketOptions extends js.Object {
  // val fd: FileDescriptor - not implemented here
  val allowHalfOpen: Boolean
  val readable: Boolean
  val writable: Boolean
}

object SocketOptions {
  def apply(
    allowHalfOpen: js.UndefOr[Boolean],
    readable: js.UndefOr[Boolean],
    writable: js.UndefOr[Boolean]
  ): SocketOptions = {
    val r = js.Dynamic.literal()
    allowHalfOpen.foreach(r.allowHalfOpen = _)
    readable.foreach(r.readable = _)
    writable.foreach(r.writable = _)
    r.asInstanceOf[SocketOptions]
  }
}