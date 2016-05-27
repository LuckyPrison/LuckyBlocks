package com.ulfric.luckyprison.luckyblock

import com.ulfric.lib.craft.entity.player.Player

Player player = event.getPlayer()

player.sendLocalizedMessage "luckyblock.heal"

player.health().heal()