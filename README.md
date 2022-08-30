# CHIPYARD for GEMM Accelerator

## Setup Chipyard

```bash
git clone https://github.com/shahzaibk23/chipyard.git
cd chipyard
./scripts/init-submodules-no-riscv-tools.sh
./scripts/build-toolchains.sh esp-tools

source env.sh

cd generators/gemmini
git fetch && git checkout v0.6.4
git submodule update

cd -
cd toolchains/esp-tools/riscv-isa-sim/build
git fetch && git checkout 090e82c473fd28b4eb2011ffcd771ead6076faab
make && make install
```

## How to Run
```bash
cd chipyard/sims/verilator
make CONFIG=GemminiRocketConfig
```
