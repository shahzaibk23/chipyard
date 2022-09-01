package chipyard.fpga.arty

import freechips.rocketchip.config.{Config}
import freechips.rocketchip.diplomacy.{AsynchronousCrossing}


class GemminiCustomConfig extends Config(
  new WithArtyTweaks ++
  new gemmini.DefaultGemminiConfig ++                        // use Gemmini systolic array GEMM accelerator
  new freechips.rocketchip.subsystem.WithNBigCores(1) ++
  new chipyard.config.AbstractConfig)

class QuadRocketConfigFPGA extends Config(
  new WithArtyTweaks ++
  new freechips.rocketchip.subsystem.WithNBigCores(4) ++    // quad-core (4 RocketTiles)
  new chipyard.config.AbstractConfig)

class DualRocketConfigFPGA extends Config(
  new WithArtyTweaks ++
  new freechips.rocketchip.subsystem.WithNBigCores(2) ++    // dual-core (2 RocketTiles)
  new chipyard.config.AbstractConfig)

class SingleRocketConfigFPGA extends Config(
  new WithArtyTweaks ++
  new freechips.rocketchip.subsystem.WithNBigCores(1) ++    // single-core (1 RocketTiles)
  new chipyard.config.AbstractConfig)