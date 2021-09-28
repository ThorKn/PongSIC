// Generator : SpinalHDL v1.6.0    git head : 73c8d8e2b86b45646e9d0b2e729291f2b65e6be3
// Component : PongSIC
// Git hash  : 7148f49366328771626c645ffd67a610d5ab07d5



module PongSIC (
  output              io_led,
  input               clk,
  input               reset
);
  reg        [19:0]   counter;
  wire       [19:0]   _zz_io_led;

  assign _zz_io_led[19 : 0] = 20'hfffff;
  assign io_led = (counter == _zz_io_led);
  always @(posedge clk or posedge reset) begin
    if(reset) begin
      counter <= 20'h0;
    end else begin
      counter <= (counter + 20'h00001);
    end
  end


endmodule
