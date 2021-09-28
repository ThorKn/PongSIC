import spinal.core._
import spinal.core.sim._
import spinal.lib._
import spinal.lib.fsm._
import spinal.lib.com.uart._

import scala.util.Random

class PongSIC extends Component{
    val io = new Bundle{
        val led = out Bool()
    }

    val counter = Reg(UInt(20 bits)) init(0)
    counter := counter + 1

    io.led  := counter === U(counter.range -> true)
}


object PongSICMain{
    def main(args: Array[String]) {
        SpinalConfig(
            mode = Verilog,
            defaultClockDomainFrequency = FixedFrequency(12 MHz)
        ).generate(new PongSIC)

        val spinalConfig = SpinalConfig(defaultClockDomainFrequency = FixedFrequency(12 MHz))

        /*
        SimConfig
            .withConfig(spinalConfig)
            .withWave
            .compile(new PongSic)
            .doSim{ pongsic =>
                pongsic.clockDomain.forkStimulus(2)
                }
                var idx = 0
                while(idx < 3000000){
                    pongsic.clockDomain.waitSampling()
                    idx += 1
                }
            }
        */
    }
}
