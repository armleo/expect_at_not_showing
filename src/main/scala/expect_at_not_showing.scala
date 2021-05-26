package expect_at_not_showing_package

import chisel3._
import chisel3.util._


class expect_at_not_showing_module extends Module {
  val io = IO(new Bundle {
    val some_out = Output(Bool())
  })
  val some_reg = RegInit(false.B)
  some_reg := !some_reg
  io.some_out := some_reg
  
}