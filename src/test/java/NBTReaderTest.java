import vip.fubuki.bukkit.util.NBTAPIWrapper;

import java.util.Map;

public class NBTReaderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(
                "{\n" +
                "    Count: 1b,\n" +
                "    id: \"create:furnace_minecart_contraption\",\n" +
                "    tag: {\n" +
                "        Contraption: {\n" +
                "            Actors: [\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4266 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: 2, Z: -5 },\n" +
                "                    Position: [579.5, -1.5, 350.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4267 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: 1, Z: -5 },\n" +
                "                    Position: [579.5, -2.5, 350.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4268 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -1, Y: 2, Z: -5 },\n" +
                "                    Position: [578.5, -1.5, 350.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { HeldItem: { Count: 1b, id: \"minecraft:oak_log\" } },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: 2, Z: -3 },\n" +
                "                    Position: [580.5, -3.5, 353.5],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { HeldItem: { Count: 1b, id: \"minecraft:torch\" } },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: 2, Z: -2 },\n" +
                "                    Position: [580.5, -3.5, 354.5],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4269 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: 2, Z: -5 },\n" +
                "                    Position: [580.5, -1.5, 350.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { SeatIndex: 0 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: 0, Z: 5 },\n" +
                "                    Position: [579.5, -3.5, 361.5],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4270 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: 0, Z: 3 },\n" +
                "                    Position: [579.5, -3.5, 359.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { HeldItem: { Count: 0b, id: \"minecraft:air\" } },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: 0, Z: -3 },\n" +
                "                    Position: [579.5, -3.5, 355.5],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4271 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: 0, Z: -5 },\n" +
                "                    Position: [579.5, -3.5, 350.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4272 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -1, Y: 1, Z: -5 },\n" +
                "                    Position: [578.5, -2.5, 350.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4273 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: 1, Z: -5 },\n" +
                "                    Position: [580.5, -2.5, 350.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { SeatIndex: 1 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: 0, Z: 5 },\n" +
                "                    Position: [580.5, -3.5, 361.5],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4274 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: 0, Z: 3 },\n" +
                "                    Position: [580.5, -3.5, 358.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4275 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -1, Y: 0, Z: -5 },\n" +
                "                    Position: [578.5, -3.5, 350.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4276 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: 0, Z: -5 },\n" +
                "                    Position: [580.5, -3.5, 350.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { HeldItem: { Count: 0b, id: \"minecraft:air\" } },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -1, Y: -1, Z: -9 },\n" +
                "                    Position: [578.5, -4.5, 349.5],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { HeldItem: { Count: 0b, id: \"minecraft:air\" } },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -1, Y: 0, Z: -9 },\n" +
                "                    Position: [578.5, -3.5, 349.5],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { HeldItem: { Count: 0b, id: \"minecraft:air\" } },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: -1, Z: -9 },\n" +
                "                    Position: [579.5, -4.5, 349.5],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { HeldItem: { Count: 0b, id: \"minecraft:air\" } },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -1, Y: 1, Z: -9 },\n" +
                "                    Position: [578.5, -2.5, 349.5],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { HeldItem: { Count: 0b, id: \"minecraft:air\" } },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -2, Y: 0, Z: -9 },\n" +
                "                    Position: [577.5, -3.5, 349.5],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { HeldItem: { Count: 0b, id: \"minecraft:air\" } },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: 0, Z: -9 },\n" +
                "                    Position: [579.5, -3.5, 349.5],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { HeldItem: { Count: 0b, id: \"minecraft:air\" } },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: -1, Z: -9 },\n" +
                "                    Position: [580.5, -4.5, 349.5],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { HeldItem: { Count: 0b, id: \"minecraft:air\" } },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -1, Y: 2, Z: -9 },\n" +
                "                    Position: [578.5, -1.5, 349.5],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { HeldItem: { Count: 0b, id: \"minecraft:air\" } },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -2, Y: 1, Z: -9 },\n" +
                "                    Position: [577.5, -2.5, 349.5],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { HeldItem: { Count: 0b, id: \"minecraft:air\" } },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: 1, Z: -9 },\n" +
                "                    Position: [579.5, -2.5, 349.5],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { HeldItem: { Count: 0b, id: \"minecraft:air\" } },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: 0, Z: -9 },\n" +
                "                    Position: [580.5, -3.5, 349.5],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { HeldItem: { Count: 0b, id: \"minecraft:air\" } },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -1, Y: 3, Z: -9 },\n" +
                "                    Position: [578.5, -0.5, 349.5],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { HeldItem: { Count: 0b, id: \"minecraft:air\" } },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -2, Y: 2, Z: -9 },\n" +
                "                    Position: [577.5, -1.5, 349.5],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { HeldItem: { Count: 0b, id: \"minecraft:air\" } },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: 2, Z: -9 },\n" +
                "                    Position: [579.5, -1.5, 349.5],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { HeldItem: { Count: 0b, id: \"minecraft:air\" } },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: 1, Z: -9 },\n" +
                "                    Position: [580.5, -2.5, 349.5],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { HeldItem: { Count: 0b, id: \"minecraft:air\" } },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 2, Y: 0, Z: -9 },\n" +
                "                    Position: [581.5, -3.5, 349.5],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { HeldItem: { Count: 0b, id: \"minecraft:air\" } },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: 3, Z: -9 },\n" +
                "                    Position: [579.5, -0.5, 349.5],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { HeldItem: { Count: 0b, id: \"minecraft:air\" } },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: 2, Z: -9 },\n" +
                "                    Position: [580.5, -1.5, 349.5],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { HeldItem: { Count: 0b, id: \"minecraft:air\" } },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 2, Y: 1, Z: -9 },\n" +
                "                    Position: [581.5, -2.5, 349.5],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4277 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -1, Y: -1, Z: -10 },\n" +
                "                    Position: [578.5, -4.5, 346.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4278 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -1, Y: 0, Z: -10 },\n" +
                "                    Position: [578.5, -3.5, 346.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4279 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: -1, Z: -10 },\n" +
                "                    Position: [579.5, -4.5, 346.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4280 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -1, Y: 1, Z: -10 },\n" +
                "                    Position: [578.5, -2.5, 346.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4281 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -2, Y: 0, Z: -10 },\n" +
                "                    Position: [577.5, -3.5, 346.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4282 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: 0, Z: -10 },\n" +
                "                    Position: [579.5, -3.5, 346.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4283 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: -1, Z: -10 },\n" +
                "                    Position: [580.5, -4.5, 346.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4284 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -1, Y: 2, Z: -10 },\n" +
                "                    Position: [578.5, -1.5, 346.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4285 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -2, Y: 1, Z: -10 },\n" +
                "                    Position: [577.5, -2.5, 346.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4286 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: 1, Z: -10 },\n" +
                "                    Position: [579.5, -2.5, 346.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4287 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: 0, Z: -10 },\n" +
                "                    Position: [580.5, -3.5, 346.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4288 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -1, Y: 3, Z: -10 },\n" +
                "                    Position: [578.5, -0.5, 346.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4289 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -2, Y: 2, Z: -10 },\n" +
                "                    Position: [577.5, -1.5, 346.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4290 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: 2, Z: -10 },\n" +
                "                    Position: [579.5, -1.5, 346.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4291 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: 1, Z: -10 },\n" +
                "                    Position: [580.5, -2.5, 346.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4292 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 2, Y: 0, Z: -10 },\n" +
                "                    Position: [581.5, -3.5, 346.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4293 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: 3, Z: -10 },\n" +
                "                    Position: [579.5, -0.5, 346.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4294 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: 2, Z: -10 },\n" +
                "                    Position: [580.5, -1.5, 346.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4295 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 2, Y: 1, Z: -10 },\n" +
                "                    Position: [581.5, -2.5, 346.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: {  },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -2, Y: -1, Z: -12 },\n" +
                "                    Position: [577.5, -4.5, 344.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { HeldItem: { Count: 0b, id: \"minecraft:air\" } },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: 3, Z: -9 },\n" +
                "                    Position: [580.5, -0.5, 349.5],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { HeldItem: { Count: 0b, id: \"minecraft:air\" } },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 2, Y: 2, Z: -9 },\n" +
                "                    Position: [581.5, -1.5, 349.5],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4296 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: 3, Z: -10 },\n" +
                "                    Position: [580.5, -0.5, 346.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4297 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 2, Y: 2, Z: -10 },\n" +
                "                    Position: [581.5, -1.5, 346.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: {  },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 2, Y: -1, Z: -12 },\n" +
                "                    Position: [581.5, -4.5, 344.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: {  },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -2, Y: 0, Z: -12 },\n" +
                "                    Position: [577.5, -3.5, 344.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: {  },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -1, Y: -1, Z: -12 },\n" +
                "                    Position: [578.5, -4.5, 344.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: {  },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 2, Y: 0, Z: -12 },\n" +
                "                    Position: [581.5, -3.5, 344.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: {  },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: -1, Z: -12 },\n" +
                "                    Position: [580.5, -4.5, 344.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: {  },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -2, Y: 1, Z: -12 },\n" +
                "                    Position: [577.5, -2.5, 344.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: {  },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: -1, Z: -12 },\n" +
                "                    Position: [579.5, -4.5, 344.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: {  },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 2, Y: 1, Z: -12 },\n" +
                "                    Position: [581.5, -2.5, 344.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: {  },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -2, Y: 2, Z: -12 },\n" +
                "                    Position: [577.5, -1.5, 344.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: {  },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 2, Y: 2, Z: -12 },\n" +
                "                    Position: [581.5, -1.5, 344.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: {  },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -2, Y: 3, Z: -12 },\n" +
                "                    Position: [577.5, -0.5, 344.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: {  },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 2, Y: 3, Z: -12 },\n" +
                "                    Position: [581.5, -0.5, 344.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: {  },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -1, Y: 3, Z: -12 },\n" +
                "                    Position: [578.5, -0.5, 344.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4298 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: 1, Z: -14 },\n" +
                "                    Position: [579.5, -2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: {  },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: 3, Z: -12 },\n" +
                "                    Position: [580.5, -0.5, 344.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: {  },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: 3, Z: -12 },\n" +
                "                    Position: [579.5, -0.5, 344.05],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4299 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: 0, Z: -14 },\n" +
                "                    Position: [579.5, -3.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4300 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: 2, Z: -14 },\n" +
                "                    Position: [579.5, -1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4301 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -1, Y: 1, Z: -14 },\n" +
                "                    Position: [578.5, -2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4302 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: 1, Z: -14 },\n" +
                "                    Position: [580.5, -2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4303 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: -1, Z: -14 },\n" +
                "                    Position: [579.5, -4.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4304 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -1, Y: 0, Z: -14 },\n" +
                "                    Position: [578.5, -3.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4305 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: 0, Z: -14 },\n" +
                "                    Position: [580.5, -3.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4306 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: 3, Z: -14 },\n" +
                "                    Position: [579.5, -0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4307 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -1, Y: 2, Z: -14 },\n" +
                "                    Position: [578.5, -1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4308 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: 2, Z: -14 },\n" +
                "                    Position: [580.5, -1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4309 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -2, Y: 1, Z: -14 },\n" +
                "                    Position: [577.5, -2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4310 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 2, Y: 1, Z: -14 },\n" +
                "                    Position: [581.5, -2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4311 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: -2, Z: -14 },\n" +
                "                    Position: [579.5, -5.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4312 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -1, Y: -1, Z: -14 },\n" +
                "                    Position: [578.5, -4.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4313 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: -1, Z: -14 },\n" +
                "                    Position: [580.5, -4.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4314 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -2, Y: 0, Z: -14 },\n" +
                "                    Position: [577.5, -3.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4315 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 2, Y: 0, Z: -14 },\n" +
                "                    Position: [581.5, -3.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4316 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: 4, Z: -14 },\n" +
                "                    Position: [579.5, 0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4317 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -1, Y: 3, Z: -14 },\n" +
                "                    Position: [578.5, -0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4318 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: 3, Z: -14 },\n" +
                "                    Position: [580.5, -0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4319 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -2, Y: 2, Z: -14 },\n" +
                "                    Position: [577.5, -1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4320 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 2, Y: 2, Z: -14 },\n" +
                "                    Position: [581.5, -1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4321 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -3, Y: 1, Z: -14 },\n" +
                "                    Position: [576.5, -2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4322 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 3, Y: 1, Z: -14 },\n" +
                "                    Position: [582.5, -2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4323 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: -3, Z: -14 },\n" +
                "                    Position: [579.5, -6.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4324 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -1, Y: -2, Z: -14 },\n" +
                "                    Position: [578.5, -5.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4325 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: -2, Z: -14 },\n" +
                "                    Position: [580.5, -5.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4326 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -2, Y: -1, Z: -14 },\n" +
                "                    Position: [577.5, -4.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4327 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 2, Y: -1, Z: -14 },\n" +
                "                    Position: [581.5, -4.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4328 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -3, Y: 0, Z: -14 },\n" +
                "                    Position: [576.5, -3.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4329 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 3, Y: 0, Z: -14 },\n" +
                "                    Position: [582.5, -3.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4330 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: 5, Z: -14 },\n" +
                "                    Position: [579.5, 1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4331 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -1, Y: 4, Z: -14 },\n" +
                "                    Position: [578.5, 0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4332 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: 4, Z: -14 },\n" +
                "                    Position: [580.5, 0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4333 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -2, Y: 3, Z: -14 },\n" +
                "                    Position: [577.5, -0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4334 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 2, Y: 3, Z: -14 },\n" +
                "                    Position: [581.5, -0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4335 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -3, Y: 2, Z: -14 },\n" +
                "                    Position: [576.5, -1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4336 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 3, Y: 2, Z: -14 },\n" +
                "                    Position: [582.5, -1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4337 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -4, Y: 1, Z: -14 },\n" +
                "                    Position: [575.5, -2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4338 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 4, Y: 1, Z: -14 },\n" +
                "                    Position: [583.5, -2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4339 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -1, Y: -3, Z: -14 },\n" +
                "                    Position: [578.5, -6.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4340 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: -3, Z: -14 },\n" +
                "                    Position: [580.5, -6.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4341 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -2, Y: -2, Z: -14 },\n" +
                "                    Position: [577.5, -5.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4342 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 2, Y: -2, Z: -14 },\n" +
                "                    Position: [581.5, -5.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4343 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -3, Y: -1, Z: -14 },\n" +
                "                    Position: [576.5, -4.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4344 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 3, Y: -1, Z: -14 },\n" +
                "                    Position: [582.5, -4.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4345 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -4, Y: 0, Z: -14 },\n" +
                "                    Position: [575.5, -3.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4346 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 4, Y: 0, Z: -14 },\n" +
                "                    Position: [583.5, -3.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4347 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 0, Y: 6, Z: -14 },\n" +
                "                    Position: [579.5, 2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4348 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -1, Y: 5, Z: -14 },\n" +
                "                    Position: [578.5, 1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4349 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: 5, Z: -14 },\n" +
                "                    Position: [580.5, 1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4350 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -2, Y: 4, Z: -14 },\n" +
                "                    Position: [577.5, 0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4351 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 2, Y: 4, Z: -14 },\n" +
                "                    Position: [581.5, 0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4352 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -3, Y: 3, Z: -14 },\n" +
                "                    Position: [576.5, -0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4353 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 3, Y: 3, Z: -14 },\n" +
                "                    Position: [582.5, -0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4354 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -4, Y: 2, Z: -14 },\n" +
                "                    Position: [575.5, -1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4355 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 4, Y: 2, Z: -14 },\n" +
                "                    Position: [583.5, -1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4356 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -5, Y: 1, Z: -14 },\n" +
                "                    Position: [574.5, -2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4357 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 5, Y: 1, Z: -14 },\n" +
                "                    Position: [584.5, -2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4358 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -2, Y: -3, Z: -14 },\n" +
                "                    Position: [577.5, -6.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4359 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 2, Y: -3, Z: -14 },\n" +
                "                    Position: [581.5, -6.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4360 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -3, Y: -2, Z: -14 },\n" +
                "                    Position: [576.5, -5.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4361 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 3, Y: -2, Z: -14 },\n" +
                "                    Position: [582.5, -5.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4362 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -4, Y: -1, Z: -14 },\n" +
                "                    Position: [575.5, -4.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4363 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 4, Y: -1, Z: -14 },\n" +
                "                    Position: [583.5, -4.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4364 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -5, Y: 0, Z: -14 },\n" +
                "                    Position: [574.5, -3.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4365 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 5, Y: 0, Z: -14 },\n" +
                "                    Position: [584.5, -3.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4366 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -1, Y: 6, Z: -14 },\n" +
                "                    Position: [578.5, 2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4367 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 1, Y: 6, Z: -14 },\n" +
                "                    Position: [580.5, 2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4368 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -2, Y: 5, Z: -14 },\n" +
                "                    Position: [577.5, 1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4369 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 2, Y: 5, Z: -14 },\n" +
                "                    Position: [581.5, 1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4370 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -3, Y: 4, Z: -14 },\n" +
                "                    Position: [576.5, 0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4371 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 3, Y: 4, Z: -14 },\n" +
                "                    Position: [582.5, 0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4372 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -4, Y: 3, Z: -14 },\n" +
                "                    Position: [575.5, -0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4373 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 4, Y: 3, Z: -14 },\n" +
                "                    Position: [583.5, -0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4374 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -5, Y: 2, Z: -14 },\n" +
                "                    Position: [574.5, -1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4375 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 5, Y: 2, Z: -14 },\n" +
                "                    Position: [584.5, -1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4376 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -6, Y: 1, Z: -14 },\n" +
                "                    Position: [573.5, -2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4377 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 6, Y: 1, Z: -14 },\n" +
                "                    Position: [585.5, -2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4378 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -3, Y: -3, Z: -14 },\n" +
                "                    Position: [576.5, -6.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4379 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 3, Y: -3, Z: -14 },\n" +
                "                    Position: [582.5, -6.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4380 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -4, Y: -2, Z: -14 },\n" +
                "                    Position: [575.5, -5.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4381 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 4, Y: -2, Z: -14 },\n" +
                "                    Position: [583.5, -5.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4382 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -5, Y: -1, Z: -14 },\n" +
                "                    Position: [574.5, -4.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4383 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 5, Y: -1, Z: -14 },\n" +
                "                    Position: [584.5, -4.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4384 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -6, Y: 0, Z: -14 },\n" +
                "                    Position: [573.5, -3.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4385 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 6, Y: 0, Z: -14 },\n" +
                "                    Position: [585.5, -3.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4386 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -2, Y: 6, Z: -14 },\n" +
                "                    Position: [577.5, 2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4387 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 2, Y: 6, Z: -14 },\n" +
                "                    Position: [581.5, 2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4388 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -3, Y: 5, Z: -14 },\n" +
                "                    Position: [576.5, 1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4389 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 3, Y: 5, Z: -14 },\n" +
                "                    Position: [582.5, 1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4390 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -4, Y: 4, Z: -14 },\n" +
                "                    Position: [575.5, 0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4391 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 4, Y: 4, Z: -14 },\n" +
                "                    Position: [583.5, 0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4392 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -5, Y: 3, Z: -14 },\n" +
                "                    Position: [574.5, -0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4393 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 5, Y: 3, Z: -14 },\n" +
                "                    Position: [584.5, -0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4394 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -6, Y: 2, Z: -14 },\n" +
                "                    Position: [573.5, -1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4395 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 6, Y: 2, Z: -14 },\n" +
                "                    Position: [585.5, -1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4396 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -7, Y: 1, Z: -14 },\n" +
                "                    Position: [572.5, -2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4397 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 7, Y: 1, Z: -14 },\n" +
                "                    Position: [586.5, -2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4398 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -4, Y: -3, Z: -14 },\n" +
                "                    Position: [575.5, -6.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4399 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 4, Y: -3, Z: -14 },\n" +
                "                    Position: [583.5, -6.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4400 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -5, Y: -2, Z: -14 },\n" +
                "                    Position: [574.5, -5.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4401 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 5, Y: -2, Z: -14 },\n" +
                "                    Position: [584.5, -5.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4402 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -6, Y: -1, Z: -14 },\n" +
                "                    Position: [573.5, -4.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4403 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 6, Y: -1, Z: -14 },\n" +
                "                    Position: [585.5, -4.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4404 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -7, Y: 0, Z: -14 },\n" +
                "                    Position: [572.5, -3.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4405 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 7, Y: 0, Z: -14 },\n" +
                "                    Position: [586.5, -3.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4406 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -3, Y: 6, Z: -14 },\n" +
                "                    Position: [576.5, 2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4407 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 3, Y: 6, Z: -14 },\n" +
                "                    Position: [582.5, 2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4408 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -4, Y: 5, Z: -14 },\n" +
                "                    Position: [575.5, 1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4409 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 4, Y: 5, Z: -14 },\n" +
                "                    Position: [583.5, 1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4410 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -5, Y: 4, Z: -14 },\n" +
                "                    Position: [574.5, 0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4411 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 5, Y: 4, Z: -14 },\n" +
                "                    Position: [584.5, 0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4412 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -6, Y: 3, Z: -14 },\n" +
                "                    Position: [573.5, -0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4413 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 6, Y: 3, Z: -14 },\n" +
                "                    Position: [585.5, -0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4414 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -7, Y: 2, Z: -14 },\n" +
                "                    Position: [572.5, -1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4415 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 7, Y: 2, Z: -14 },\n" +
                "                    Position: [586.5, -1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4416 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -5, Y: -3, Z: -14 },\n" +
                "                    Position: [574.5, -6.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4417 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 5, Y: -3, Z: -14 },\n" +
                "                    Position: [584.5, -6.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4418 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -6, Y: -2, Z: -14 },\n" +
                "                    Position: [573.5, -5.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4419 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 6, Y: -2, Z: -14 },\n" +
                "                    Position: [585.5, -5.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4420 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -7, Y: -1, Z: -14 },\n" +
                "                    Position: [572.5, -4.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4421 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 7, Y: -1, Z: -14 },\n" +
                "                    Position: [586.5, -4.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4422 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -4, Y: 6, Z: -14 },\n" +
                "                    Position: [575.5, 2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4423 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 4, Y: 6, Z: -14 },\n" +
                "                    Position: [583.5, 2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4424 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -5, Y: 5, Z: -14 },\n" +
                "                    Position: [574.5, 1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4425 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 5, Y: 5, Z: -14 },\n" +
                "                    Position: [584.5, 1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4426 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -6, Y: 4, Z: -14 },\n" +
                "                    Position: [573.5, 0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4427 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 6, Y: 4, Z: -14 },\n" +
                "                    Position: [585.5, 0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4428 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -7, Y: 3, Z: -14 },\n" +
                "                    Position: [572.5, -0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4429 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 7, Y: 3, Z: -14 },\n" +
                "                    Position: [586.5, -0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4430 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -6, Y: -3, Z: -14 },\n" +
                "                    Position: [573.5, -6.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4431 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 6, Y: -3, Z: -14 },\n" +
                "                    Position: [585.5, -6.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4432 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -7, Y: -2, Z: -14 },\n" +
                "                    Position: [572.5, -5.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4433 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 7, Y: -2, Z: -14 },\n" +
                "                    Position: [586.5, -5.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4434 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -5, Y: 6, Z: -14 },\n" +
                "                    Position: [574.5, 2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4435 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 5, Y: 6, Z: -14 },\n" +
                "                    Position: [584.5, 2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4436 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -6, Y: 5, Z: -14 },\n" +
                "                    Position: [573.5, 1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4437 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 6, Y: 5, Z: -14 },\n" +
                "                    Position: [585.5, 1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4438 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -7, Y: 4, Z: -14 },\n" +
                "                    Position: [572.5, 0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4439 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 7, Y: 4, Z: -14 },\n" +
                "                    Position: [586.5, 0.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4440 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -7, Y: -3, Z: -14 },\n" +
                "                    Position: [572.5, -6.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4441 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 7, Y: -3, Z: -14 },\n" +
                "                    Position: [586.5, -6.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4442 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -6, Y: 6, Z: -14 },\n" +
                "                    Position: [573.5, 2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4443 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 6, Y: 6, Z: -14 },\n" +
                "                    Position: [585.5, 2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4444 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -7, Y: 5, Z: -14 },\n" +
                "                    Position: [572.5, 1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4445 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 7, Y: 5, Z: -14 },\n" +
                "                    Position: [586.5, 1.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4446 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: -7, Y: 6, Z: -14 },\n" +
                "                    Position: [572.5, 2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                },\n" +
                "                {\n" +
                "                    Data: { BreakerId: -4447 },\n" +
                "                    FirstMovement: 0b,\n" +
                "                    Motion: [0.0, 0.0, 0.0],\n" +
                "                    Pos: { X: 7, Y: 6, Z: -14 },\n" +
                "                    Position: [586.5, 2.5, 341.85000002384186],\n" +
                "                    RelativeMotion: [0.0, 0.0, 0.0],\n" +
                "                    Stall: 0b\n" +
                "                }\n" +
                "            ],\n" +
                "            Anchor: { X: 579, Y: -4, Z: 356 },\n" +
                "            Blocks: {\n" +
                "                BlockList: [\n" +
                "                    { Pos: 0l, State: 0 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 2199023198212l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1924145291268l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 2199023202310l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1649267384324l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1924145295366l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1374389477380l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1649267388422l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1099511570436l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1374389481478l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 824633663492l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1099511574534l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 549755756548l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 824633667590l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 274877849604l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 549755760646l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 274877853702l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -57340l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Data: { ScrollValue: 1, id: \"create:chassis\" }, Pos: -53242l, State: 2 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -274877964284l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -274877960186l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -549755871228l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -549755867130l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -824633778172l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -824633774074l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1099511685116l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1099511681018l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1374389592060l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1374389587962l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1649267499004l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1649267494906l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Data: { ScrollValue: 1, id: \"create:chassis\" }, Pos: 1l, State: 3 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 2199023198211l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1924145291267l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 2199023202309l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1649267384323l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1924145295365l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1374389477379l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1649267388421l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -824633655297l, State: 4 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1099511570435l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1374389481477l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -549755748353l, State: 4 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 824633663491l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1099511574533l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -274877841409l, State: 4 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 549755756547l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 824633667589l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 65535l, State: 4 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 274877849603l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 549755760645l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 274877972479l, State: 4 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 274877853701l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -57341l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 549755879423l, State: 4 },\n" +
                "                    { Data: { ScrollValue: 1, id: \"create:chassis\" }, Pos: -53243l, State: 2 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -274877964285l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 824633786367l, State: 4 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -274877960187l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -549755871229l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -549755867131l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -824633778173l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -824633774075l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1099511685117l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1099511681019l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1374389592061l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1374389587963l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1649267499005l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1649267494907l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Data: { ScrollValue: 4, id: \"create:chassis\" }, Pos: 2l, State: 5 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 2199023198210l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1924145291266l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 2199023202308l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1649267384322l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1924145295364l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1374389477378l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1649267388420l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1099511570434l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1374389481476l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 824633663490l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1099511574532l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 549755756546l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 824633667588l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 274877849602l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 549755760644l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 274877853700l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -57342l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Data: { ScrollValue: 1, id: \"create:chassis\" }, Pos: -53244l, State: 2 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -274877964286l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -274877960188l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -549755871230l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -549755867132l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -824633778174l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -824633774076l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1099511685118l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1099511681020l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1374389592062l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1374389587964l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1649267499006l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1649267494908l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 2199023198209l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1924145291265l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 2199023202307l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1649267384321l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1924145295363l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1374389477377l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1649267388419l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1099511570433l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1374389481475l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Pos: -824633659393l, State: 6 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 824633663489l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1099511574531l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -549755752449l, State: 4 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 549755756545l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 824633667587l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -274877845505l, State: 4 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 274877849601l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 549755760643l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 61439l, State: 4 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 274877853699l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -57343l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 274877968383l, State: 4 },\n" +
                "                    { Data: { ScrollValue: 1, id: \"create:chassis\" }, Pos: -53245l, State: 2 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -274877964287l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 549755875327l, State: 4 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -274877960189l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -549755871231l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Pos: 824633782271l, State: 6 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -549755867133l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -824633778175l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -824633774077l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1099511685119l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1099511681021l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1374389592063l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1374389587965l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1649267499007l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1649267494909l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 2199023198208l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1924145291264l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 2199023202306l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1649267384320l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1924145295362l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1374389477376l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1649267388418l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1099511570432l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1374389481474l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 824633663488l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1099511574530l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 549755756544l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 824633667586l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 274877849600l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 549755760642l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 274877853698l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -57344l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Data: { ScrollValue: 1, id: \"create:chassis\" }, Pos: -53246l, State: 2 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -274877964288l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -274877960190l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -549755871232l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -549755867134l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -824633778176l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -824633774078l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1099511685120l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1099511681022l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1374389592064l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1374389587966l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1649267499008l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1649267494910l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 2199023202303l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 2199023202305l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1924145295359l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1924145295361l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1649267388415l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1649267388417l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1374389481471l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1374389481473l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1099511574527l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1099511574529l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 824633667583l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 15, id: \"create:chassis\" },\n" +
                "                        Pos: -824633663489l,\n" +
                "                        State: 7\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 824633667585l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 549755760639l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 15, id: \"create:chassis\" },\n" +
                "                        Pos: -549755756545l,\n" +
                "                        State: 7\n" +
                "                    },\n" +
                "                    { Data: { id: \"create:harvester\" }, Pos: 824633671683l, State: 8 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 549755760641l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 274877853695l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 15, id: \"create:chassis\" },\n" +
                "                        Pos: -274877849601l,\n" +
                "                        State: 7\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 3, id: \"create:chassis\" },\n" +
                "                        Pos: 274877853697l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Data: { id: \"create:harvester\" }, Pos: 549755764739l, State: 8 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -53249l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Data: { ScrollValue: 15, id: \"create:chassis\" }, Pos: 57343l, State: 7 },\n" +
                "                    { Data: { ScrollValue: 1, id: \"create:chassis\" }, Pos: -53247l, State: 2 },\n" +
                "                    { Data: { id: \"create:harvester\" }, Pos: 274877857795l, State: 8 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -274877960193l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 15, id: \"create:chassis\" },\n" +
                "                        Pos: 274877964287l,\n" +
                "                        State: 7\n" +
                "                    },\n" +
                "                    { Data: { id: \"create:harvester\" }, Pos: -49149l, State: 8 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -274877960191l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -549755867137l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 15, id: \"create:chassis\" },\n" +
                "                        Pos: 549755871231l,\n" +
                "                        State: 7\n" +
                "                    },\n" +
                "                    { Data: { id: \"create:harvester\" }, Pos: -274877956093l, State: 8 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -549755867135l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -824633774081l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 15, id: \"create:chassis\" },\n" +
                "                        Pos: 824633778175l,\n" +
                "                        State: 7\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -824633774079l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1099511681025l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1099511681023l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1374389587969l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1374389587967l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1649267494913l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1649267494911l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 2199023202302l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 2199023202304l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1924145295358l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1924145295360l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1649267388414l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1649267388416l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1374389481470l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1374389481472l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1099511574526l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1099511574528l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 824633667582l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 824633667584l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 549755760638l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Data: { id: \"create:harvester\" }, Pos: 824633671682l, State: 8 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 549755760640l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 274877853694l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 274877853696l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -53250l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Data: { ScrollValue: 1, id: \"create:chassis\" }, Pos: -53248l, State: 2 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -274877960194l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -274877960192l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -549755867138l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Data: { id: \"create:harvester\" }, Pos: -274877956094l, State: 8 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -549755867136l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -824633774082l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -824633774080l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1099511681026l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1099511681024l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1374389587970l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1374389587968l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1649267494914l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1649267494912l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 2199023202301l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 2199023206399l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1924145295357l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1924145299455l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1649267388413l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1649267392511l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1374389481469l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1374389485567l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1099511574525l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1099511578623l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 824633667581l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 824633671679l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 549755760637l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Data: { id: \"create:harvester\" }, Pos: 824633671681l, State: 8 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 549755764735l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 274877853693l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 824633675779l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 274877857791l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -53251l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Pos: -274877853697l, State: 9 },\n" +
                "                    { Pos: 274877857793l, State: 10 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 549755768835l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Data: { ScrollValue: 1, id: \"create:chassis\" }, Pos: -49153l, State: 2 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -274877960195l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Pos: 53247l, State: 9 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 274877861891l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -274877956097l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -549755867139l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Pos: 274877960191l, State: 9 },\n" +
                "                    { Data: { id: \"create:harvester\" }, Pos: -274877956095l, State: 8 },\n" +
                "                    { Data: { ScrollValue: 1, id: \"create:chassis\" }, Pos: -45053l, State: 2 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -549755863041l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -824633774083l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -274877951997l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -824633769985l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1099511681027l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1099511676929l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1374389587971l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1374389583873l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1649267494915l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1649267490817l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Pos: -824633602049l, State: 6 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -549755695105l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -274877788161l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 118783l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 274878025727l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 549755932671l, State: 4 },\n" +
                "                    { Pos: 824633839615l, State: 6 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 2199023206398l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1924145299454l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1649267392510l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1374389485566l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1099511578622l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 824633671678l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Data: { id: \"create:harvester\" }, Pos: 824633671680l, State: 8 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 549755764734l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 824633675778l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 274877857790l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Data: { ScrollValue: 1, id: \"create:chassis\" }, Pos: -49154l, State: 2 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -274877956098l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Data: { id: \"create:harvester\" }, Pos: -274877956096l, State: 8 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -549755863042l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -274877951998l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -824633769986l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1099511676930l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1374389583874l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1649267490818l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 2199023206397l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1924145299453l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1649267392509l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1374389485565l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 1099511578621l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 824633671677l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Data: { id: \"create:harvester\" }, Pos: 824633675775l, State: 8 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 549755764733l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 824633675777l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Data: { id: \"create:harvester\" }, Pos: 549755768831l, State: 8 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 274877857789l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Data: { id: \"create:harvester\" }, Pos: 274877861887l, State: 8 },\n" +
                "                    { Data: { ScrollValue: 1, id: \"create:chassis\" }, Pos: -49155l, State: 2 },\n" +
                "                    { Pos: -274877857793l, State: 9 },\n" +
                "                    { Pos: 549755772931l, State: 11 },\n" +
                "                    { Data: { id: \"create:harvester\" }, Pos: -45057l, State: 8 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 2, id: \"create:chassis\" },\n" +
                "                        Pos: 274877861889l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -274877956099l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Pos: 49151l, State: 9 },\n" +
                "                    { Pos: 274877865987l, State: 11 },\n" +
                "                    { Data: { id: \"create:harvester\" }, Pos: -274877952001l, State: 8 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -549755863043l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Pos: 274877956095l, State: 9 },\n" +
                "                    { Pos: -40957l, State: 11 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -274877951999l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -824633769987l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1099511676931l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1374389583875l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -1649267490819l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -824633606145l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -549755699201l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -274877792257l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 114687l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 274878021631l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 549755928575l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 824633835519l, State: 4 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 824633675776l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Pos: 824633679874l, State: 11 },\n" +
                "                    { Pos: 549755772930l, State: 11 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 274877861888l,\n" +
                "                        State: 3\n" +
                "                    },\n" +
                "                    { Pos: 274877865986l, State: 11 },\n" +
                "                    { Pos: -40958l, State: 11 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -274877952000l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Pos: -274877947902l, State: 11 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 824633679871l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Pos: 824633679873l, State: 11 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 549755772927l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Pos: 549755772929l, State: 11 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 274877865983l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Pos: -274877861889l, State: 9 },\n" +
                "                    { Pos: 274877865985l, State: 11 },\n" +
                "                    { Data: { ScrollValue: 1, id: \"create:chassis\" }, Pos: -40961l, State: 2 },\n" +
                "                    {\n" +
                "                        Data: {\n" +
                "                            Filter: {\n" +
                "                                Count: 1b,\n" +
                "                                id: \"create:filter\",\n" +
                "                                tag: {\n" +
                "                                    Blacklist: 0b,\n" +
                "                                    Items: {\n" +
                "                                        Items: [\n" +
                "                                            { Count: 1b, Slot: 0, id: \"minecraft:netherrack\" },\n" +
                "                                            { Count: 1b, Slot: 1, id: \"minecraft:basalt\" },\n" +
                "                                            { Count: 1b, Slot: 9, id: \"minecraft:cobblestone\" },\n" +
                "                                            { Count: 1b, Slot: 10, id: \"minecraft:cobbled_deepslate\" }\n" +
                "                                        ],\n" +
                "                                        Size: 18\n" +
                "                                    },\n" +
                "                                    RespectNBT: 0b\n" +
                "                                }\n" +
                "                            },\n" +
                "                            FilterAmount: 0,\n" +
                "                            HeldItem: { Count: 0b, id: \"minecraft:air\" },\n" +
                "                            Mode: \"USE\",\n" +
                "                            Overflow: [],\n" +
                "                            Powered: 0b,\n" +
                "                            Speed: 0f,\n" +
                "                            State: \"WAITING\",\n" +
                "                            Timer: 0,\n" +
                "                            id: \"create:deployer\"\n" +
                "                        },\n" +
                "                        Pos: 549755777027l,\n" +
                "                        State: 12\n" +
                "                    },\n" +
                "                    { Pos: 45055l, State: 9 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -274877947905l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: {\n" +
                "                            Filter: {\n" +
                "                                Count: 1b,\n" +
                "                                id: \"create:filter\",\n" +
                "                                tag: {\n" +
                "                                    Blacklist: 0b,\n" +
                "                                    Items: {\n" +
                "                                        Items: [\n" +
                "                                            { Count: 1b, Slot: 0, id: \"minecraft:netherrack\" },\n" +
                "                                            { Count: 1b, Slot: 1, id: \"minecraft:basalt\" },\n" +
                "                                            { Count: 1b, Slot: 9, id: \"minecraft:cobblestone\" },\n" +
                "                                            { Count: 1b, Slot: 10, id: \"minecraft:cobbled_deepslate\" }\n" +
                "                                        ],\n" +
                "                                        Size: 18\n" +
                "                                    },\n" +
                "                                    RespectNBT: 0b\n" +
                "                                }\n" +
                "                            },\n" +
                "                            FilterAmount: 0,\n" +
                "                            HeldItem: { Count: 0b, id: \"minecraft:air\" },\n" +
                "                            Mode: \"USE\",\n" +
                "                            Overflow: [],\n" +
                "                            Powered: 0b,\n" +
                "                            Speed: 0f,\n" +
                "                            State: \"WAITING\",\n" +
                "                            Timer: 0,\n" +
                "                            id: \"create:deployer\"\n" +
                "                        },\n" +
                "                        Pos: 274877870083l,\n" +
                "                        State: 12\n" +
                "                    },\n" +
                "                    { Pos: -40959l, State: 11 },\n" +
                "                    { Pos: 274877951999l, State: 9 },\n" +
                "                    {\n" +
                "                        Data: {\n" +
                "                            Filter: {\n" +
                "                                Count: 1b,\n" +
                "                                id: \"create:filter\",\n" +
                "                                tag: {\n" +
                "                                    Blacklist: 0b,\n" +
                "                                    Items: {\n" +
                "                                        Items: [\n" +
                "                                            { Count: 1b, Slot: 0, id: \"minecraft:netherrack\" },\n" +
                "                                            { Count: 1b, Slot: 1, id: \"minecraft:basalt\" },\n" +
                "                                            { Count: 1b, Slot: 9, id: \"minecraft:cobblestone\" },\n" +
                "                                            { Count: 1b, Slot: 10, id: \"minecraft:cobbled_deepslate\" }\n" +
                "                                        ],\n" +
                "                                        Size: 18\n" +
                "                                    },\n" +
                "                                    RespectNBT: 0b\n" +
                "                                }\n" +
                "                            },\n" +
                "                            FilterAmount: 0,\n" +
                "                            HeldItem: { Count: 0b, id: \"minecraft:air\" },\n" +
                "                            Mode: \"USE\",\n" +
                "                            Overflow: [],\n" +
                "                            Powered: 0b,\n" +
                "                            Speed: 0f,\n" +
                "                            State: \"WAITING\",\n" +
                "                            Timer: 0,\n" +
                "                            id: \"create:deployer\"\n" +
                "                        },\n" +
                "                        Pos: -36861l,\n" +
                "                        State: 12\n" +
                "                    },\n" +
                "                    { Pos: -274877947903l, State: 11 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -824633610241l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -549755703297l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -274877796353l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 110591l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 274878017535l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 549755924479l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 824633831423l, State: 4 },\n" +
                "                    { Pos: 824633679872l, State: 11 },\n" +
                "                    { Pos: 549755772928l, State: 11 },\n" +
                "                    {\n" +
                "                        Data: {\n" +
                "                            Filter: {\n" +
                "                                Count: 1b,\n" +
                "                                id: \"create:filter\",\n" +
                "                                tag: {\n" +
                "                                    Blacklist: 0b,\n" +
                "                                    Items: {\n" +
                "                                        Items: [\n" +
                "                                            { Count: 1b, Slot: 0, id: \"minecraft:netherrack\" },\n" +
                "                                            { Count: 1b, Slot: 1, id: \"minecraft:basalt\" },\n" +
                "                                            { Count: 1b, Slot: 9, id: \"minecraft:cobblestone\" },\n" +
                "                                            { Count: 1b, Slot: 10, id: \"minecraft:cobbled_deepslate\" }\n" +
                "                                        ],\n" +
                "                                        Size: 18\n" +
                "                                    },\n" +
                "                                    RespectNBT: 0b\n" +
                "                                }\n" +
                "                            },\n" +
                "                            FilterAmount: 0,\n" +
                "                            HeldItem: { Count: 0b, id: \"minecraft:air\" },\n" +
                "                            Mode: \"USE\",\n" +
                "                            Overflow: [],\n" +
                "                            Powered: 0b,\n" +
                "                            Speed: 0f,\n" +
                "                            State: \"WAITING\",\n" +
                "                            Timer: 0,\n" +
                "                            id: \"create:deployer\"\n" +
                "                        },\n" +
                "                        Pos: 824633683970l,\n" +
                "                        State: 12\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: {\n" +
                "                            Filter: {\n" +
                "                                Count: 1b,\n" +
                "                                id: \"create:filter\",\n" +
                "                                tag: {\n" +
                "                                    Blacklist: 0b,\n" +
                "                                    Items: {\n" +
                "                                        Items: [\n" +
                "                                            { Count: 1b, Slot: 0, id: \"minecraft:netherrack\" },\n" +
                "                                            { Count: 1b, Slot: 1, id: \"minecraft:basalt\" },\n" +
                "                                            { Count: 1b, Slot: 9, id: \"minecraft:cobblestone\" },\n" +
                "                                            { Count: 1b, Slot: 10, id: \"minecraft:cobbled_deepslate\" }\n" +
                "                                        ],\n" +
                "                                        Size: 18\n" +
                "                                    },\n" +
                "                                    RespectNBT: 0b\n" +
                "                                }\n" +
                "                            },\n" +
                "                            FilterAmount: 0,\n" +
                "                            HeldItem: { Count: 0b, id: \"minecraft:air\" },\n" +
                "                            Mode: \"USE\",\n" +
                "                            Overflow: [],\n" +
                "                            Powered: 0b,\n" +
                "                            Speed: 0f,\n" +
                "                            State: \"WAITING\",\n" +
                "                            Timer: 0,\n" +
                "                            id: \"create:deployer\"\n" +
                "                        },\n" +
                "                        Pos: 549755777026l,\n" +
                "                        State: 12\n" +
                "                    },\n" +
                "                    { Pos: 274877865984l, State: 11 },\n" +
                "                    {\n" +
                "                        Data: {\n" +
                "                            Filter: {\n" +
                "                                Count: 1b,\n" +
                "                                id: \"create:filter\",\n" +
                "                                tag: {\n" +
                "                                    Blacklist: 0b,\n" +
                "                                    Items: {\n" +
                "                                        Items: [\n" +
                "                                            { Count: 1b, Slot: 0, id: \"minecraft:netherrack\" },\n" +
                "                                            { Count: 1b, Slot: 1, id: \"minecraft:basalt\" },\n" +
                "                                            { Count: 1b, Slot: 9, id: \"minecraft:cobblestone\" },\n" +
                "                                            { Count: 1b, Slot: 10, id: \"minecraft:cobbled_deepslate\" }\n" +
                "                                        ],\n" +
                "                                        Size: 18\n" +
                "                                    },\n" +
                "                                    RespectNBT: 0b\n" +
                "                                }\n" +
                "                            },\n" +
                "                            FilterAmount: 0,\n" +
                "                            HeldItem: { Count: 0b, id: \"minecraft:air\" },\n" +
                "                            Mode: \"USE\",\n" +
                "                            Overflow: [],\n" +
                "                            Powered: 0b,\n" +
                "                            Speed: 0f,\n" +
                "                            State: \"WAITING\",\n" +
                "                            Timer: 0,\n" +
                "                            id: \"create:deployer\"\n" +
                "                        },\n" +
                "                        Pos: 274877870082l,\n" +
                "                        State: 12\n" +
                "                    },\n" +
                "                    { Pos: -40960l, State: 11 },\n" +
                "                    {\n" +
                "                        Data: {\n" +
                "                            Filter: {\n" +
                "                                Count: 1b,\n" +
                "                                id: \"create:filter\",\n" +
                "                                tag: {\n" +
                "                                    Blacklist: 0b,\n" +
                "                                    Items: {\n" +
                "                                        Items: [\n" +
                "                                            { Count: 1b, Slot: 0, id: \"minecraft:netherrack\" },\n" +
                "                                            { Count: 1b, Slot: 1, id: \"minecraft:basalt\" },\n" +
                "                                            { Count: 1b, Slot: 9, id: \"minecraft:cobblestone\" },\n" +
                "                                            { Count: 1b, Slot: 10, id: \"minecraft:cobbled_deepslate\" }\n" +
                "                                        ],\n" +
                "                                        Size: 18\n" +
                "                                    },\n" +
                "                                    RespectNBT: 0b\n" +
                "                                }\n" +
                "                            },\n" +
                "                            FilterAmount: 0,\n" +
                "                            HeldItem: { Count: 0b, id: \"minecraft:air\" },\n" +
                "                            Mode: \"USE\",\n" +
                "                            Overflow: [],\n" +
                "                            Powered: 0b,\n" +
                "                            Speed: 0f,\n" +
                "                            State: \"WAITING\",\n" +
                "                            Timer: 0,\n" +
                "                            id: \"create:deployer\"\n" +
                "                        },\n" +
                "                        Pos: -36862l,\n" +
                "                        State: 12\n" +
                "                    },\n" +
                "                    { Pos: -274877947904l, State: 11 },\n" +
                "                    {\n" +
                "                        Data: {\n" +
                "                            Filter: {\n" +
                "                                Count: 1b,\n" +
                "                                id: \"create:filter\",\n" +
                "                                tag: {\n" +
                "                                    Blacklist: 0b,\n" +
                "                                    Items: {\n" +
                "                                        Items: [\n" +
                "                                            { Count: 1b, Slot: 0, id: \"minecraft:netherrack\" },\n" +
                "                                            { Count: 1b, Slot: 1, id: \"minecraft:basalt\" },\n" +
                "                                            { Count: 1b, Slot: 9, id: \"minecraft:cobblestone\" },\n" +
                "                                            { Count: 1b, Slot: 10, id: \"minecraft:cobbled_deepslate\" }\n" +
                "                                        ],\n" +
                "                                        Size: 18\n" +
                "                                    },\n" +
                "                                    RespectNBT: 0b\n" +
                "                                }\n" +
                "                            },\n" +
                "                            FilterAmount: 0,\n" +
                "                            HeldItem: { Count: 0b, id: \"minecraft:air\" },\n" +
                "                            Mode: \"USE\",\n" +
                "                            Overflow: [],\n" +
                "                            Powered: 0b,\n" +
                "                            Speed: 0f,\n" +
                "                            State: \"WAITING\",\n" +
                "                            Timer: 0,\n" +
                "                            id: \"create:deployer\"\n" +
                "                        },\n" +
                "                        Pos: -274877943806l,\n" +
                "                        State: 12\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 4, id: \"create:chassis\" },\n" +
                "                        Pos: 824633683967l,\n" +
                "                        State: 13\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: {\n" +
                "                            Filter: {\n" +
                "                                Count: 1b,\n" +
                "                                id: \"create:filter\",\n" +
                "                                tag: {\n" +
                "                                    Blacklist: 0b,\n" +
                "                                    Items: {\n" +
                "                                        Items: [\n" +
                "                                            { Count: 1b, Slot: 0, id: \"minecraft:netherrack\" },\n" +
                "                                            { Count: 1b, Slot: 1, id: \"minecraft:basalt\" },\n" +
                "                                            { Count: 1b, Slot: 9, id: \"minecraft:cobblestone\" },\n" +
                "                                            { Count: 1b, Slot: 10, id: \"minecraft:cobbled_deepslate\" }\n" +
                "                                        ],\n" +
                "                                        Size: 18\n" +
                "                                    },\n" +
                "                                    RespectNBT: 0b\n" +
                "                                }\n" +
                "                            },\n" +
                "                            FilterAmount: 0,\n" +
                "                            HeldItem: { Count: 0b, id: \"minecraft:air\" },\n" +
                "                            Mode: \"USE\",\n" +
                "                            Overflow: [],\n" +
                "                            Powered: 0b,\n" +
                "                            Speed: 0f,\n" +
                "                            State: \"WAITING\",\n" +
                "                            Timer: 0,\n" +
                "                            id: \"create:deployer\"\n" +
                "                        },\n" +
                "                        Pos: 824633683969l,\n" +
                "                        State: 12\n" +
                "                    },\n" +
                "                    { Pos: 549755777023l, State: 11 },\n" +
                "                    {\n" +
                "                        Data: {\n" +
                "                            Filter: {\n" +
                "                                Count: 1b,\n" +
                "                                id: \"create:filter\",\n" +
                "                                tag: {\n" +
                "                                    Blacklist: 0b,\n" +
                "                                    Items: {\n" +
                "                                        Items: [\n" +
                "                                            { Count: 1b, Slot: 0, id: \"minecraft:netherrack\" },\n" +
                "                                            { Count: 1b, Slot: 1, id: \"minecraft:basalt\" },\n" +
                "                                            { Count: 1b, Slot: 9, id: \"minecraft:cobblestone\" },\n" +
                "                                            { Count: 1b, Slot: 10, id: \"minecraft:cobbled_deepslate\" }\n" +
                "                                        ],\n" +
                "                                        Size: 18\n" +
                "                                    },\n" +
                "                                    RespectNBT: 0b\n" +
                "                                }\n" +
                "                            },\n" +
                "                            FilterAmount: 0,\n" +
                "                            HeldItem: { Count: 0b, id: \"minecraft:air\" },\n" +
                "                            Mode: \"USE\",\n" +
                "                            Overflow: [],\n" +
                "                            Powered: 0b,\n" +
                "                            Speed: 0f,\n" +
                "                            State: \"WAITING\",\n" +
                "                            Timer: 0,\n" +
                "                            id: \"create:deployer\"\n" +
                "                        },\n" +
                "                        Pos: 549755777025l,\n" +
                "                        State: 12\n" +
                "                    },\n" +
                "                    { Pos: 274877870079l, State: 11 },\n" +
                "                    { Pos: -274877865985l, State: 9 },\n" +
                "                    {\n" +
                "                        Data: {\n" +
                "                            Filter: {\n" +
                "                                Count: 1b,\n" +
                "                                id: \"create:filter\",\n" +
                "                                tag: {\n" +
                "                                    Blacklist: 0b,\n" +
                "                                    Items: {\n" +
                "                                        Items: [\n" +
                "                                            { Count: 1b, Slot: 0, id: \"minecraft:netherrack\" },\n" +
                "                                            { Count: 1b, Slot: 1, id: \"minecraft:basalt\" },\n" +
                "                                            { Count: 1b, Slot: 9, id: \"minecraft:cobblestone\" },\n" +
                "                                            { Count: 1b, Slot: 10, id: \"minecraft:cobbled_deepslate\" }\n" +
                "                                        ],\n" +
                "                                        Size: 18\n" +
                "                                    },\n" +
                "                                    RespectNBT: 0b\n" +
                "                                }\n" +
                "                            },\n" +
                "                            FilterAmount: 0,\n" +
                "                            HeldItem: { Count: 0b, id: \"minecraft:air\" },\n" +
                "                            Mode: \"USE\",\n" +
                "                            Overflow: [],\n" +
                "                            Powered: 0b,\n" +
                "                            Speed: 0f,\n" +
                "                            State: \"WAITING\",\n" +
                "                            Timer: 0,\n" +
                "                            id: \"create:deployer\"\n" +
                "                        },\n" +
                "                        Pos: 274877870081l,\n" +
                "                        State: 12\n" +
                "                    },\n" +
                "                    { Pos: -36865l, State: 11 },\n" +
                "                    { Pos: 40959l, State: 9 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 4, id: \"create:chassis\" },\n" +
                "                        Pos: -274877943809l,\n" +
                "                        State: 14\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: {\n" +
                "                            Filter: {\n" +
                "                                Count: 1b,\n" +
                "                                id: \"create:filter\",\n" +
                "                                tag: {\n" +
                "                                    Blacklist: 0b,\n" +
                "                                    Items: {\n" +
                "                                        Items: [\n" +
                "                                            { Count: 1b, Slot: 0, id: \"minecraft:netherrack\" },\n" +
                "                                            { Count: 1b, Slot: 1, id: \"minecraft:basalt\" },\n" +
                "                                            { Count: 1b, Slot: 9, id: \"minecraft:cobblestone\" },\n" +
                "                                            { Count: 1b, Slot: 10, id: \"minecraft:cobbled_deepslate\" }\n" +
                "                                        ],\n" +
                "                                        Size: 18\n" +
                "                                    },\n" +
                "                                    RespectNBT: 0b\n" +
                "                                }\n" +
                "                            },\n" +
                "                            FilterAmount: 0,\n" +
                "                            HeldItem: { Count: 0b, id: \"minecraft:air\" },\n" +
                "                            Mode: \"USE\",\n" +
                "                            Overflow: [],\n" +
                "                            Powered: 0b,\n" +
                "                            Speed: 0f,\n" +
                "                            State: \"WAITING\",\n" +
                "                            Timer: 0,\n" +
                "                            id: \"create:deployer\"\n" +
                "                        },\n" +
                "                        Pos: -36863l,\n" +
                "                        State: 12\n" +
                "                    },\n" +
                "                    { Pos: 274877947903l, State: 9 },\n" +
                "                    {\n" +
                "                        Data: {\n" +
                "                            Filter: {\n" +
                "                                Count: 1b,\n" +
                "                                id: \"create:filter\",\n" +
                "                                tag: {\n" +
                "                                    Blacklist: 0b,\n" +
                "                                    Items: {\n" +
                "                                        Items: [\n" +
                "                                            { Count: 1b, Slot: 0, id: \"minecraft:netherrack\" },\n" +
                "                                            { Count: 1b, Slot: 1, id: \"minecraft:basalt\" },\n" +
                "                                            { Count: 1b, Slot: 9, id: \"minecraft:cobblestone\" },\n" +
                "                                            { Count: 1b, Slot: 10, id: \"minecraft:cobbled_deepslate\" }\n" +
                "                                        ],\n" +
                "                                        Size: 18\n" +
                "                                    },\n" +
                "                                    RespectNBT: 0b\n" +
                "                                }\n" +
                "                            },\n" +
                "                            FilterAmount: 0,\n" +
                "                            HeldItem: { Count: 0b, id: \"minecraft:air\" },\n" +
                "                            Mode: \"USE\",\n" +
                "                            Overflow: [],\n" +
                "                            Powered: 0b,\n" +
                "                            Speed: 0f,\n" +
                "                            State: \"WAITING\",\n" +
                "                            Timer: 0,\n" +
                "                            id: \"create:deployer\"\n" +
                "                        },\n" +
                "                        Pos: -274877943807l,\n" +
                "                        State: 12\n" +
                "                    },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -824633614337l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -549755707393l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -274877800449l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 106495l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 274878013439l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 549755920383l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 824633827327l, State: 4 },\n" +
                "                    {\n" +
                "                        Data: {\n" +
                "                            Filter: {\n" +
                "                                Count: 1b,\n" +
                "                                id: \"create:filter\",\n" +
                "                                tag: {\n" +
                "                                    Blacklist: 0b,\n" +
                "                                    Items: {\n" +
                "                                        Items: [\n" +
                "                                            { Count: 1b, Slot: 0, id: \"minecraft:netherrack\" },\n" +
                "                                            { Count: 1b, Slot: 1, id: \"minecraft:basalt\" },\n" +
                "                                            { Count: 1b, Slot: 9, id: \"minecraft:cobblestone\" },\n" +
                "                                            { Count: 1b, Slot: 10, id: \"minecraft:cobbled_deepslate\" }\n" +
                "                                        ],\n" +
                "                                        Size: 18\n" +
                "                                    },\n" +
                "                                    RespectNBT: 0b\n" +
                "                                }\n" +
                "                            },\n" +
                "                            FilterAmount: 0,\n" +
                "                            HeldItem: { Count: 0b, id: \"minecraft:air\" },\n" +
                "                            Mode: \"USE\",\n" +
                "                            Overflow: [],\n" +
                "                            Powered: 0b,\n" +
                "                            Speed: 0f,\n" +
                "                            State: \"WAITING\",\n" +
                "                            Timer: 0,\n" +
                "                            id: \"create:deployer\"\n" +
                "                        },\n" +
                "                        Pos: 824633683968l,\n" +
                "                        State: 12\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: {\n" +
                "                            Filter: {\n" +
                "                                Count: 1b,\n" +
                "                                id: \"create:filter\",\n" +
                "                                tag: {\n" +
                "                                    Blacklist: 0b,\n" +
                "                                    Items: {\n" +
                "                                        Items: [\n" +
                "                                            { Count: 1b, Slot: 0, id: \"minecraft:netherrack\" },\n" +
                "                                            { Count: 1b, Slot: 1, id: \"minecraft:basalt\" },\n" +
                "                                            { Count: 1b, Slot: 9, id: \"minecraft:cobblestone\" },\n" +
                "                                            { Count: 1b, Slot: 10, id: \"minecraft:cobbled_deepslate\" }\n" +
                "                                        ],\n" +
                "                                        Size: 18\n" +
                "                                    },\n" +
                "                                    RespectNBT: 0b\n" +
                "                                }\n" +
                "                            },\n" +
                "                            FilterAmount: 0,\n" +
                "                            HeldItem: { Count: 0b, id: \"minecraft:air\" },\n" +
                "                            Mode: \"USE\",\n" +
                "                            Overflow: [],\n" +
                "                            Powered: 0b,\n" +
                "                            Speed: 0f,\n" +
                "                            State: \"WAITING\",\n" +
                "                            Timer: 0,\n" +
                "                            id: \"create:deployer\"\n" +
                "                        },\n" +
                "                        Pos: 549755777024l,\n" +
                "                        State: 12\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: {\n" +
                "                            Filter: {\n" +
                "                                Count: 1b,\n" +
                "                                id: \"create:filter\",\n" +
                "                                tag: {\n" +
                "                                    Blacklist: 0b,\n" +
                "                                    Items: {\n" +
                "                                        Items: [\n" +
                "                                            { Count: 1b, Slot: 0, id: \"minecraft:netherrack\" },\n" +
                "                                            { Count: 1b, Slot: 1, id: \"minecraft:basalt\" },\n" +
                "                                            { Count: 1b, Slot: 9, id: \"minecraft:cobblestone\" },\n" +
                "                                            { Count: 1b, Slot: 10, id: \"minecraft:cobbled_deepslate\" }\n" +
                "                                        ],\n" +
                "                                        Size: 18\n" +
                "                                    },\n" +
                "                                    RespectNBT: 0b\n" +
                "                                }\n" +
                "                            },\n" +
                "                            FilterAmount: 0,\n" +
                "                            HeldItem: { Count: 0b, id: \"minecraft:air\" },\n" +
                "                            Mode: \"USE\",\n" +
                "                            Overflow: [],\n" +
                "                            Powered: 0b,\n" +
                "                            Speed: 0f,\n" +
                "                            State: \"WAITING\",\n" +
                "                            Timer: 0,\n" +
                "                            id: \"create:deployer\"\n" +
                "                        },\n" +
                "                        Pos: 274877870080l,\n" +
                "                        State: 12\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: {\n" +
                "                            Filter: {\n" +
                "                                Count: 1b,\n" +
                "                                id: \"create:filter\",\n" +
                "                                tag: {\n" +
                "                                    Blacklist: 0b,\n" +
                "                                    Items: {\n" +
                "                                        Items: [\n" +
                "                                            { Count: 1b, Slot: 0, id: \"minecraft:netherrack\" },\n" +
                "                                            { Count: 1b, Slot: 1, id: \"minecraft:basalt\" },\n" +
                "                                            { Count: 1b, Slot: 9, id: \"minecraft:cobblestone\" },\n" +
                "                                            { Count: 1b, Slot: 10, id: \"minecraft:cobbled_deepslate\" }\n" +
                "                                        ],\n" +
                "                                        Size: 18\n" +
                "                                    },\n" +
                "                                    RespectNBT: 0b\n" +
                "                                }\n" +
                "                            },\n" +
                "                            FilterAmount: 0,\n" +
                "                            HeldItem: { Count: 0b, id: \"minecraft:air\" },\n" +
                "                            Mode: \"USE\",\n" +
                "                            Overflow: [],\n" +
                "                            Powered: 0b,\n" +
                "                            Speed: 0f,\n" +
                "                            State: \"WAITING\",\n" +
                "                            Timer: 0,\n" +
                "                            id: \"create:deployer\"\n" +
                "                        },\n" +
                "                        Pos: -36864l,\n" +
                "                        State: 12\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: {\n" +
                "                            Filter: {\n" +
                "                                Count: 1b,\n" +
                "                                id: \"create:filter\",\n" +
                "                                tag: {\n" +
                "                                    Blacklist: 0b,\n" +
                "                                    Items: {\n" +
                "                                        Items: [\n" +
                "                                            { Count: 1b, Slot: 0, id: \"minecraft:netherrack\" },\n" +
                "                                            { Count: 1b, Slot: 1, id: \"minecraft:basalt\" },\n" +
                "                                            { Count: 1b, Slot: 9, id: \"minecraft:cobblestone\" },\n" +
                "                                            { Count: 1b, Slot: 10, id: \"minecraft:cobbled_deepslate\" }\n" +
                "                                        ],\n" +
                "                                        Size: 18\n" +
                "                                    },\n" +
                "                                    RespectNBT: 0b\n" +
                "                                }\n" +
                "                            },\n" +
                "                            FilterAmount: 0,\n" +
                "                            HeldItem: { Count: 0b, id: \"minecraft:air\" },\n" +
                "                            Mode: \"USE\",\n" +
                "                            Overflow: [],\n" +
                "                            Powered: 0b,\n" +
                "                            Speed: 0f,\n" +
                "                            State: \"WAITING\",\n" +
                "                            Timer: 0,\n" +
                "                            id: \"create:deployer\"\n" +
                "                        },\n" +
                "                        Pos: -274877943808l,\n" +
                "                        State: 12\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 4, id: \"create:chassis\" },\n" +
                "                        Pos: 824633688063l,\n" +
                "                        State: 13\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: {\n" +
                "                            Filter: {\n" +
                "                                Count: 1b,\n" +
                "                                id: \"create:filter\",\n" +
                "                                tag: {\n" +
                "                                    Blacklist: 0b,\n" +
                "                                    Items: {\n" +
                "                                        Items: [\n" +
                "                                            { Count: 1b, Slot: 0, id: \"minecraft:netherrack\" },\n" +
                "                                            { Count: 1b, Slot: 1, id: \"minecraft:basalt\" },\n" +
                "                                            { Count: 1b, Slot: 9, id: \"minecraft:cobblestone\" },\n" +
                "                                            { Count: 1b, Slot: 10, id: \"minecraft:cobbled_deepslate\" }\n" +
                "                                        ],\n" +
                "                                        Size: 18\n" +
                "                                    },\n" +
                "                                    RespectNBT: 0b\n" +
                "                                }\n" +
                "                            },\n" +
                "                            FilterAmount: 0,\n" +
                "                            HeldItem: { Count: 0b, id: \"minecraft:air\" },\n" +
                "                            Mode: \"USE\",\n" +
                "                            Overflow: [],\n" +
                "                            Powered: 0b,\n" +
                "                            Speed: 0f,\n" +
                "                            State: \"WAITING\",\n" +
                "                            Timer: 0,\n" +
                "                            id: \"create:deployer\"\n" +
                "                        },\n" +
                "                        Pos: 549755781119l,\n" +
                "                        State: 12\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: {\n" +
                "                            Filter: {\n" +
                "                                Count: 1b,\n" +
                "                                id: \"create:filter\",\n" +
                "                                tag: {\n" +
                "                                    Blacklist: 0b,\n" +
                "                                    Items: {\n" +
                "                                        Items: [\n" +
                "                                            { Count: 1b, Slot: 0, id: \"minecraft:netherrack\" },\n" +
                "                                            { Count: 1b, Slot: 1, id: \"minecraft:basalt\" },\n" +
                "                                            { Count: 1b, Slot: 9, id: \"minecraft:cobblestone\" },\n" +
                "                                            { Count: 1b, Slot: 10, id: \"minecraft:cobbled_deepslate\" }\n" +
                "                                        ],\n" +
                "                                        Size: 18\n" +
                "                                    },\n" +
                "                                    RespectNBT: 0b\n" +
                "                                }\n" +
                "                            },\n" +
                "                            FilterAmount: 0,\n" +
                "                            HeldItem: { Count: 0b, id: \"minecraft:air\" },\n" +
                "                            Mode: \"USE\",\n" +
                "                            Overflow: [],\n" +
                "                            Powered: 0b,\n" +
                "                            Speed: 0f,\n" +
                "                            State: \"WAITING\",\n" +
                "                            Timer: 0,\n" +
                "                            id: \"create:deployer\"\n" +
                "                        },\n" +
                "                        Pos: 274877874175l,\n" +
                "                        State: 12\n" +
                "                    },\n" +
                "                    { Pos: -274877870081l, State: 9 },\n" +
                "                    {\n" +
                "                        Data: {\n" +
                "                            Filter: {\n" +
                "                                Count: 1b,\n" +
                "                                id: \"create:filter\",\n" +
                "                                tag: {\n" +
                "                                    Blacklist: 0b,\n" +
                "                                    Items: {\n" +
                "                                        Items: [\n" +
                "                                            { Count: 1b, Slot: 0, id: \"minecraft:netherrack\" },\n" +
                "                                            { Count: 1b, Slot: 1, id: \"minecraft:basalt\" },\n" +
                "                                            { Count: 1b, Slot: 9, id: \"minecraft:cobblestone\" },\n" +
                "                                            { Count: 1b, Slot: 10, id: \"minecraft:cobbled_deepslate\" }\n" +
                "                                        ],\n" +
                "                                        Size: 18\n" +
                "                                    },\n" +
                "                                    RespectNBT: 0b\n" +
                "                                }\n" +
                "                            },\n" +
                "                            FilterAmount: 0,\n" +
                "                            HeldItem: { Count: 0b, id: \"minecraft:air\" },\n" +
                "                            Mode: \"USE\",\n" +
                "                            Overflow: [],\n" +
                "                            Powered: 0b,\n" +
                "                            Speed: 0f,\n" +
                "                            State: \"WAITING\",\n" +
                "                            Timer: 0,\n" +
                "                            id: \"create:deployer\"\n" +
                "                        },\n" +
                "                        Pos: -32769l,\n" +
                "                        State: 12\n" +
                "                    },\n" +
                "                    { Pos: 549755785219l, State: 10 },\n" +
                "                    { Pos: 36863l, State: 9 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 4, id: \"create:chassis\" },\n" +
                "                        Pos: -274877939713l,\n" +
                "                        State: 14\n" +
                "                    },\n" +
                "                    { Pos: 274877878275l, State: 10 },\n" +
                "                    { Pos: 274877943807l, State: 9 },\n" +
                "                    { Pos: -28669l, State: 10 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -824633618433l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -549755711489l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -274877804545l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 102399l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 274878009343l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 549755916287l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 824633823231l, State: 4 },\n" +
                "                    { Pos: 824633692162l, State: 10 },\n" +
                "                    { Pos: 549755785218l, State: 10 },\n" +
                "                    { Pos: 274877878274l, State: 10 },\n" +
                "                    { Pos: -28670l, State: 10 },\n" +
                "                    { Pos: -274877935614l, State: 10 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 824633692159l,\n" +
                "                        State: 15\n" +
                "                    },\n" +
                "                    { Pos: 824633692161l, State: 10 },\n" +
                "                    { Pos: 549755785217l, State: 10 },\n" +
                "                    { Pos: -274877874177l, State: 9 },\n" +
                "                    { Pos: 274877878273l, State: 10 },\n" +
                "                    { Pos: 32767l, State: 9 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -274877935617l,\n" +
                "                        State: 15\n" +
                "                    },\n" +
                "                    { Pos: -28671l, State: 10 },\n" +
                "                    { Pos: 274877939711l, State: 9 },\n" +
                "                    { Pos: -274877935615l, State: 10 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -824633622529l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -549755715585l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -274877808641l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 98303l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 274878005247l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 549755912191l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 824633819135l, State: 4 },\n" +
                "                    { Pos: 824633692160l, State: 10 },\n" +
                "                    { Pos: 549755785216l, State: 10 },\n" +
                "                    { Pos: 274877878272l, State: 10 },\n" +
                "                    { Pos: -28672l, State: 10 },\n" +
                "                    { Pos: -274877935616l, State: 10 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 4, id: \"create:chassis\" },\n" +
                "                        Pos: 824633696255l,\n" +
                "                        State: 13\n" +
                "                    },\n" +
                "                    { Pos: 549755789311l, State: 10 },\n" +
                "                    { Pos: 274877882367l, State: 10 },\n" +
                "                    { Pos: -274877878273l, State: 9 },\n" +
                "                    { Pos: -24577l, State: 10 },\n" +
                "                    { Pos: 28671l, State: 9 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 4, id: \"create:chassis\" },\n" +
                "                        Pos: -274877931521l,\n" +
                "                        State: 14\n" +
                "                    },\n" +
                "                    { Pos: 274877935615l, State: 9 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -824633626625l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -549755719681l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -274877812737l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 94207l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 274878001151l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 549755908095l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 824633815039l, State: 4 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 549755793410l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 274877886466l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -20478l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 824633700351l,\n" +
                "                        State: 15\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 549755793409l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 274877886465l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Pos: -274877882369l, State: 9 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -20479l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Pos: 24575l, State: 9 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -274877927425l,\n" +
                "                        State: 15\n" +
                "                    },\n" +
                "                    { Pos: 274877931519l, State: 9 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -824633630721l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -549755723777l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -274877816833l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 90111l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 274877997055l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 549755903999l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 824633810943l, State: 4 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 549755793408l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 24578l, State: 4 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 2, id: \"create:chassis\" },\n" +
                "                        Pos: 549755797506l,\n" +
                "                        State: 5\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 274877886464l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 274877890562l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Pos: 20480l, State: 16 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -20480l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Data: { ScrollValue: 1, id: \"create:chassis\" }, Pos: -16382l, State: 2 },\n" +
                "                    { Pos: 274877927424l, State: 16 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 824633704447l,\n" +
                "                        State: 15\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 549755797505l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 274877890561l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 8, id: \"create:chassis\" },\n" +
                "                        Pos: -274877886465l,\n" +
                "                        State: 7\n" +
                "                    },\n" +
                "                    { Data: { ScrollValue: 1, id: \"create:chassis\" }, Pos: -16383l, State: 2 },\n" +
                "                    { Data: { ScrollValue: 9, id: \"create:chassis\" }, Pos: 20479l, State: 7 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: -274877923329l,\n" +
                "                        State: 15\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 8, id: \"create:chassis\" },\n" +
                "                        Pos: 274877927423l,\n" +
                "                        State: 7\n" +
                "                    },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -824633634817l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -549755727873l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -274877820929l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 86015l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 274877992959l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 549755899903l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 824633806847l, State: 4 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 549755797504l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 20482l, State: 4 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 274877890560l,\n" +
                "                        State: 5\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: {\n" +
                "                            Filter: { Count: 1b, id: \"minecraft:oak_log\" },\n" +
                "                            FilterAmount: 0,\n" +
                "                            HeldItem: { Count: 1b, id: \"minecraft:oak_log\" },\n" +
                "                            Mode: \"USE\",\n" +
                "                            Overflow: [],\n" +
                "                            Powered: 0b,\n" +
                "                            Speed: 0f,\n" +
                "                            State: \"WAITING\",\n" +
                "                            Timer: 0,\n" +
                "                            id: \"create:deployer\"\n" +
                "                        },\n" +
                "                        Pos: 549755801602l,\n" +
                "                        State: 17\n" +
                "                    },\n" +
                "                    { Pos: 274877894658l, State: 10 },\n" +
                "                    { Data: { ScrollValue: 1, id: \"create:chassis\" }, Pos: 16384l, State: 5 },\n" +
                "                    { Data: { ScrollValue: 1, id: \"create:chassis\" }, Pos: -16384l, State: 2 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 274877923328l,\n" +
                "                        State: 5\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 7, id: \"create:chassis\" },\n" +
                "                        Pos: 824633708543l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 1, id: \"create:chassis\" },\n" +
                "                        Pos: 549755801599l,\n" +
                "                        State: 3\n" +
                "                    },\n" +
                "                    { Data: { ScrollValue: 1, id: \"create:chassis\" }, Pos: 16385l, State: 3 },\n" +
                "                    { Data: { ScrollValue: 1, id: \"create:chassis\" }, Pos: -12289l, State: 3 },\n" +
                "                    {\n" +
                "                        Data: { ScrollValue: 7, id: \"create:chassis\" },\n" +
                "                        Pos: -274877919233l,\n" +
                "                        State: 2\n" +
                "                    },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -824633638913l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -549755731969l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -274877825025l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 81919l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 274877988863l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 549755895807l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 824633802751l, State: 4 },\n" +
                "                    { Data: { ScrollValue: 2, id: \"create:chassis\" }, Pos: 16386l, State: 7 },\n" +
                "                    {\n" +
                "                        Data: {\n" +
                "                            Filter: { Count: 1b, id: \"minecraft:torch\" },\n" +
                "                            FilterAmount: 0,\n" +
                "                            HeldItem: { Count: 1b, id: \"minecraft:torch\" },\n" +
                "                            Mode: \"USE\",\n" +
                "                            Overflow: [],\n" +
                "                            Powered: 0b,\n" +
                "                            Speed: 0f,\n" +
                "                            State: \"WAITING\",\n" +
                "                            Timer: 0,\n" +
                "                            id: \"create:deployer\"\n" +
                "                        },\n" +
                "                        Pos: 549755805698l,\n" +
                "                        State: 17\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: {\n" +
                "                            Filter: { Count: 1b, id: \"minecraft:rail\" },\n" +
                "                            FilterAmount: 0,\n" +
                "                            HeldItem: { Count: 1b, id: \"minecraft:rail\" },\n" +
                "                            Mode: \"USE\",\n" +
                "                            Overflow: [],\n" +
                "                            Powered: 0b,\n" +
                "                            Speed: 0f,\n" +
                "                            State: \"WAITING\",\n" +
                "                            Timer: 0,\n" +
                "                            id: \"create:deployer\"\n" +
                "                        },\n" +
                "                        Pos: 274877894656l,\n" +
                "                        State: 12\n" +
                "                    },\n" +
                "                    { Pos: 274877898754l, State: 10 },\n" +
                "                    { Pos: 12288l, State: 11 },\n" +
                "                    {\n" +
                "                        Data: {\n" +
                "                            Filter: { Count: 0b, id: \"minecraft:air\" },\n" +
                "                            FilterAmount: 0,\n" +
                "                            Inventory: { AppliedRecipe: 0b, Items: [], ProcessingTime: -1f, RecipeTime: 0f, Size: 16 },\n" +
                "                            NextTick: 0,\n" +
                "                            Progress: 0,\n" +
                "                            RecipeIndex: 0,\n" +
                "                            Speed: 0f,\n" +
                "                            id: \"create:saw\"\n" +
                "                        },\n" +
                "                        Pos: 274877919232l,\n" +
                "                        State: 18\n" +
                "                    },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -824633643009l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -549755736065l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -274877829121l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 77823l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 274877984767l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 549755891711l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 824633798655l, State: 4 },\n" +
                "                    { Pos: 12290l, State: 10 },\n" +
                "                    { Pos: 274877902850l, State: 10 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -824633647105l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -549755740161l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -274877833217l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 73727l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 274877980671l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 549755887615l, State: 4 },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 824633794559l, State: 4 },\n" +
                "                    { Pos: 8194l, State: 10 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 2199023198214l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1924145291270l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1649267384326l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1374389477382l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1099511570438l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 824633663494l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 549755756550l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 274877849606l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -57338l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -274877964282l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -549755871226l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -824633778170l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1099511685114l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1374389592058l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1649267499002l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 2199023198213l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1924145291269l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1649267384325l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -824633651201l, State: 4 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1374389477381l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -549755744257l, State: 4 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 1099511570437l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: -274877837313l, State: 4 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 824633663493l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 69631l, State: 4 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 549755756549l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 274877976575l, State: 4 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: 274877849605l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 549755883519l, State: 4 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -57339l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Data: { Items: [], id: \"minecraft:barrel\" }, Pos: 824633790463l, State: 4 },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -274877964283l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -549755871227l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -824633778171l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1099511685115l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1374389592059l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Data: { NextTick: 1, Progress: 0, Speed: 0f, id: \"create:drill\" },\n" +
                "                        Pos: -1649267499003l,\n" +
                "                        State: 1\n" +
                "                    },\n" +
                "                    { Pos: 4098l, State: 10 }\n" +
                "                ],\n" +
                "                Palette: [\n" +
                "                    { Name: \"create:minecart_anchor\", Properties: { axis: \"z\" } },\n" +
                "                    { Name: \"create:mechanical_drill\", Properties: { facing: \"north\" } },\n" +
                "                    {\n" +
                "                        Name: \"create:linear_chassis\",\n" +
                "                        Properties: { axis: \"z\", sticky_bottom: \"true\", sticky_top: \"false\" }\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Name: \"create:linear_chassis\",\n" +
                "                        Properties: { axis: \"z\", sticky_bottom: \"false\", sticky_top: \"false\" }\n" +
                "                    },\n" +
                "                    { Name: \"minecraft:barrel\", Properties: { facing: \"south\", open: \"false\" } },\n" +
                "                    {\n" +
                "                        Name: \"create:linear_chassis\",\n" +
                "                        Properties: { axis: \"z\", sticky_bottom: \"true\", sticky_top: \"true\" }\n" +
                "                    },\n" +
                "                    { Name: \"minecraft:red_concrete\" },\n" +
                "                    {\n" +
                "                        Name: \"create:linear_chassis\",\n" +
                "                        Properties: { axis: \"z\", sticky_bottom: \"false\", sticky_top: \"true\" }\n" +
                "                    },\n" +
                "                    { Name: \"create:mechanical_harvester\", Properties: { facing: \"north\" } },\n" +
                "                    { Name: \"minecraft:smooth_stone\" },\n" +
                "                    { Name: \"minecraft:glass\" },\n" +
                "                    { Name: \"create:mechanical_plough\", Properties: { facing: \"north\" } },\n" +
                "                    {\n" +
                "                        Name: \"create:deployer\",\n" +
                "                        Properties: { axis_along_first: \"true\", facing: \"south\" }\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Name: \"create:radial_chassis\",\n" +
                "                        Properties: {\n" +
                "                            axis: \"z\",\n" +
                "                            sticky_east: \"false\",\n" +
                "                            sticky_north: \"false\",\n" +
                "                            sticky_south: \"false\",\n" +
                "                            sticky_west: \"true\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Name: \"create:radial_chassis\",\n" +
                "                        Properties: {\n" +
                "                            axis: \"z\",\n" +
                "                            sticky_east: \"true\",\n" +
                "                            sticky_north: \"false\",\n" +
                "                            sticky_south: \"false\",\n" +
                "                            sticky_west: \"false\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Name: \"create:radial_chassis\",\n" +
                "                        Properties: {\n" +
                "                            axis: \"z\",\n" +
                "                            sticky_east: \"false\",\n" +
                "                            sticky_north: \"false\",\n" +
                "                            sticky_south: \"false\",\n" +
                "                            sticky_west: \"false\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    { Name: \"create:red_seat\", Properties: { waterlogged: \"false\" } },\n" +
                "                    {\n" +
                "                        Name: \"create:deployer\",\n" +
                "                        Properties: { axis_along_first: \"false\", facing: \"down\" }\n" +
                "                    },\n" +
                "                    {\n" +
                "                        Name: \"create:mechanical_saw\",\n" +
                "                        Properties: { axis_along_first: \"false\", facing: \"north\" }\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            BottomlessSupply: 0b,\n" +
                "            BoundsFront: [-30f, -3f, -30f, 31f, 7f, 31f],\n" +
                "            FluidStorage: [],\n" +
                "            InitialOrientation: \"NORTH\",\n" +
                "            Interactors: [\n" +
                "                { Pos: { X: 1, Y: 2, Z: -2 } },\n" +
                "                { Pos: { X: 0, Y: 0, Z: -3 } },\n" +
                "                { Pos: { X: 1, Y: 2, Z: -3 } },\n" +
                "                { Pos: { X: 0, Y: 0, Z: 5 } },\n" +
                "                { Pos: { X: 1, Y: 0, Z: 5 } },\n" +
                "                { Pos: { X: 2, Y: 0, Z: -9 } },\n" +
                "                { Pos: { X: 1, Y: 0, Z: -9 } },\n" +
                "                { Pos: { X: 0, Y: 0, Z: -9 } },\n" +
                "                { Pos: { X: 2, Y: 2, Z: -9 } },\n" +
                "                { Pos: { X: -1, Y: 0, Z: -9 } },\n" +
                "                { Pos: { X: 1, Y: 2, Z: -9 } },\n" +
                "                { Pos: { X: -2, Y: 0, Z: -9 } },\n" +
                "                { Pos: { X: 0, Y: 2, Z: -9 } },\n" +
                "                { Pos: { X: -1, Y: 2, Z: -9 } },\n" +
                "                { Pos: { X: -2, Y: 2, Z: -9 } },\n" +
                "                { Pos: { X: 1, Y: -1, Z: -9 } },\n" +
                "                { Pos: { X: 0, Y: -1, Z: -9 } },\n" +
                "                { Pos: { X: 2, Y: 1, Z: -9 } },\n" +
                "                { Pos: { X: -1, Y: -1, Z: -9 } },\n" +
                "                { Pos: { X: 1, Y: 1, Z: -9 } },\n" +
                "                { Pos: { X: 0, Y: 1, Z: -9 } },\n" +
                "                { Pos: { X: -1, Y: 1, Z: -9 } },\n" +
                "                { Pos: { X: 1, Y: 3, Z: -9 } },\n" +
                "                { Pos: { X: -2, Y: 1, Z: -9 } },\n" +
                "                { Pos: { X: 0, Y: 3, Z: -9 } },\n" +
                "                { Pos: { X: -1, Y: 3, Z: -9 } }\n" +
                "            ],\n" +
                "            Passengers: [],\n" +
                "            RotationMode: \"ROTATION_LOCKED\",\n" +
                "            Seats: [{ X: 0, Y: 0, Z: 5 }, { X: 1, Y: 0, Z: 5 }],\n" +
                "            Stalled: 0b,\n" +
                "            Storage: [\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 0, Y: 2, Z: 5 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -3, Y: -1, Z: 15 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -2, Y: -1, Z: 15 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -1, Y: -1, Z: 15 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 0, Y: -1, Z: 15 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 1, Y: -1, Z: 15 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -3, Y: -1, Z: 19 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -2, Y: -1, Z: 19 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 2, Y: -1, Z: 15 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -1, Y: -1, Z: 19 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 3, Y: -1, Z: 15 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 0, Y: -1, Z: 19 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 1, Y: -1, Z: 19 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -3, Y: -1, Z: 23 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -2, Y: -1, Z: 23 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 2, Y: -1, Z: 19 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -1, Y: -1, Z: 23 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 3, Y: -1, Z: 19 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 0, Y: -1, Z: 23 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 1, Y: -1, Z: 23 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -3, Y: -1, Z: 27 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -2, Y: -1, Z: 27 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 2, Y: -1, Z: 23 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -1, Y: -1, Z: 27 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 3, Y: -1, Z: 23 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 0, Y: -1, Z: 27 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 1, Y: -1, Z: 27 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 2, Y: -1, Z: 27 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 3, Y: -1, Z: 27 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -2, Y: -1, Z: 14 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -1, Y: -1, Z: 14 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 0, Y: -1, Z: 14 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 1, Y: -1, Z: 14 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -3, Y: -1, Z: 18 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -2, Y: -1, Z: 18 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 2, Y: -1, Z: 14 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -1, Y: -1, Z: 18 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 0, Y: -1, Z: 18 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 1, Y: -1, Z: 18 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -3, Y: -1, Z: 22 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -2, Y: -1, Z: 22 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 2, Y: -1, Z: 18 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -1, Y: -1, Z: 22 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 3, Y: -1, Z: 18 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 0, Y: -1, Z: 22 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 1, Y: -1, Z: 22 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -3, Y: -1, Z: 26 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -2, Y: -1, Z: 26 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 2, Y: -1, Z: 22 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -1, Y: -1, Z: 26 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 3, Y: -1, Z: 22 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 0, Y: -1, Z: 26 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 1, Y: -1, Z: 26 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 2, Y: -1, Z: 26 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 3, Y: -1, Z: 26 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -3, Y: -1, Z: 17 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -2, Y: -1, Z: 17 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -1, Y: -1, Z: 17 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 0, Y: -1, Z: 17 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 1, Y: -1, Z: 17 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -3, Y: -1, Z: 21 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -2, Y: -1, Z: 21 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 2, Y: -1, Z: 17 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -1, Y: -1, Z: 21 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 3, Y: -1, Z: 17 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 0, Y: -1, Z: 21 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 1, Y: -1, Z: 21 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -3, Y: -1, Z: 25 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -2, Y: -1, Z: 25 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 2, Y: -1, Z: 21 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -1, Y: -1, Z: 25 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 3, Y: -1, Z: 21 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 0, Y: -1, Z: 25 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 1, Y: -1, Z: 25 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 2, Y: -1, Z: 25 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 3, Y: -1, Z: 25 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 0, Y: 2, Z: 6 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -3, Y: -1, Z: 16 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -2, Y: -1, Z: 16 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -1, Y: -1, Z: 16 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 0, Y: -1, Z: 16 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 1, Y: -1, Z: 16 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -3, Y: -1, Z: 20 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -2, Y: -1, Z: 20 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 2, Y: -1, Z: 16 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -1, Y: -1, Z: 20 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 3, Y: -1, Z: 16 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 0, Y: -1, Z: 20 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 1, Y: -1, Z: 20 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -3, Y: -1, Z: 24 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -2, Y: -1, Z: 24 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 2, Y: -1, Z: 20 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -1, Y: -1, Z: 24 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 3, Y: -1, Z: 20 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 0, Y: -1, Z: 24 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 1, Y: -1, Z: 24 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -2, Y: -1, Z: 28 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 2, Y: -1, Z: 24 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: -1, Y: -1, Z: 28 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 3, Y: -1, Z: 24 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 0, Y: -1, Z: 28 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 1, Y: -1, Z: 28 } },\n" +
                "                { Data: { Items: [], Size: 27 }, Pos: { X: 2, Y: -1, Z: 28 } }\n" +
                "            ],\n" +
                "            SubContraptions: [],\n" +
                "            Superglue: [],\n" +
                "            Type: \"mounted\"\n" +
                "        }\n" +
                "    }\n" +
                "}");
        Map map = NBTAPIWrapper.StringToMap(sb.toString(),1);
        String NBT=(String) map.get("ItemNBT");
        System.out.println(NBT);
        NBT=NBT.replace("?","{");
        NBT=NBT.replace("*","}");
        NBT=NBT.replace("~",",");
        NBT=NBT.replace("$",":");
        NBT=NBT.replace("%","\"");
        System.out.println(NBT);
        Map NBT1= NBTAPIWrapper.StringToMap(NBT,2);
        System.out.println(NBT1);
    }

}
