package com.duda.battlesnake

import java.awt.Color

data class GetBattlesnakeRes(val apiversion: String, val author: String, val color: String, val head: String, val tail: String, val version: String)

data class MoveRes(val move: String, val shout: String)

