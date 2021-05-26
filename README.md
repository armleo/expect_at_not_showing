See [issue 1939 for chisel3](https://github.com/chipsalliance/chisel3/issues/1939)
```
sbt "test"
```

Example log:
verilator output:
```
[info] [0.003] SEED 1622045045977
Enabling waves..
Exit Code: 0
[info] [0.085] RAN 1 CYCLES FAILED FIRST AT CYCLE 0
```

Firrtl output:

```

[info] [0.000] SEED 1622045063928
[info] [0.004] EXPECT AT 0   io_some_out got 0 expected 1 FAIL
[info] [0.006] EXPECT AT 1   io_some_out got 1 expected 0 FAIL
test expect_at_not_showing_module Success: 0 tests passed in 6 cycles taking 0.036932 seconds

[info] [0.022] RAN 1 CYCLES FAILED FIRST AT CYCLE 0
```