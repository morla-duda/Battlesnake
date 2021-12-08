package com.duda.battlesnake

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/")
class ApiController

@GetMapping
fun getBattlesnake(): GetBattlesnakeRes {
    return GetBattlesnakeRes("1", "morlavi", "#888888", "default", "default", "0.0.1-beta")
}

@PostMapping("/start")
fun startGame(@RequestParam game: Game,
              @RequestParam turn: Int,
              @RequestParam board: Board,
              @RequestParam you: BattleSnake) {
}

@PostMapping("/move")
fun move(@RequestParam game: Game,
         @RequestParam turn: Int,
         @RequestParam board: Board,
         @RequestParam you: BattleSnake): MoveRes {

    return MoveRes("up", "shout")
}

@PostMapping("/end")
fun endGame(@RequestParam game: Game,
            @RequestParam turn: Int,
            @RequestParam board: Board,
            @RequestParam you: BattleSnake) {
}