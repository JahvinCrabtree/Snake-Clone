// import java.awt.Rectangle;

// public class SuperFood {

//     private int x;
//     private int y;

//     public SuperFood (Snake player, Food food){
//         this.randomSuperSpawn(player, food);
//     }

//     public void randomSuperSpawn(Snake player, Food food) {
//         x = (int)(Math.random() * Game.width - 1);
//         y = (int)(Math.random() * Game.height - 1);

//         /* Same code is used to prevent it from spawning on the snake. */

//         boolean onSnake = true;
//         while(!onSnake) {
//             onSnake = false;
//             for (Rectangle r : player.getBody()){
//                 if (r.x ==x && r.y == y) {
//                     onSnake = true;
//                 }
//             }
//         }

//         boolean onFood = true;
//         while (!onFood) {
//             Rectangle sf;
//             onFood = false;
//             if (sf.x == x && sf.y == y) {
//                 onFood = true;
//             }
//         }

//     }    
// }

