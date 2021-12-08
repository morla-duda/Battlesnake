package com.duda.battlesnake

import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

data class Game(val id: String, val ruleset: Ruleset, val timeout: Int, val source: String)

data class Ruleset(val name: String, val version: Int, val settings: RulesetSettings)

data class RulesetSettings(val foodSpawnChance: Int, val minimumFood: Int, val hazardDamagePerTurn: Int, val royale: Royale, val squad: Squad)

data class Royale(val shrinkEveryNTurns: Int)

data class Squad(val allowBodyCollisions: Boolean, val sharedElimination: Boolean, val sharedHealth: Boolean, val sharedLength: Boolean)

data class BattleSnake(val id: String, val name: String, val health: Int, val body: Array<Coordinate>, val latency: String, val head: Coordinate, val length:Int, val shout:String, val squad:String )

data class Coordinate(val x: Int, val y: Int)

data class Board(val height: Int, val width: Int, val food: Array<Coordinate>, val hazards: Array<Coordinate>, val snakes: Array<BattleSnake>)

