package expect_at_not_showing_package

import chisel3.iotesters
import chisel3.iotesters.{ChiselFlatSpec, Driver, PeekPokeTester}

class expect_at_not_showing_module_UnitTester(c: expect_at_not_showing_module) extends PeekPokeTester(c) {
  expect(c.io.some_out, 1)
  step(1)

  expect(c.io.some_out, 0)
  step(0)
}


class expect_at_not_showing_module_Tester extends ChiselFlatSpec {
  
  "expect_at_not_showing_module_Test" should s" (with verilator)" in {
    Driver.execute(Array("--generate-vcd-output", "on", "--backend-name", "verilator", "--target-dir", "test_run_dir/", "--top-name", "expect_at_not_showing_top"), () => new expect_at_not_showing_module()) {
      c => new expect_at_not_showing_module_UnitTester(c)
    } should be (true)
  }
  
  "expect_at_not_showing_module_Test" should s" (with firrtl)" in {
    Driver.execute(Array("--generate-vcd-output", "on", "--backend-name", "firrtl", "--target-dir", "test_run_dir/", "--top-name", "expect_at_not_showing_top"), () => new expect_at_not_showing_module()) {
      c => new expect_at_not_showing_module_UnitTester(c)
    } should be (true)
  }

}