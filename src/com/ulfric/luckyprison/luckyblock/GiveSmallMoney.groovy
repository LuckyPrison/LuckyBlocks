package com.ulfric.luckyprison.luckyblock

import com.ulfric.lib.craft.entity.player.Player
import com.ulfric.lib.coffee.economy.Bank
import com.ulfric.lib.coffee.economy.BankAccount
import com.ulfric.lib.coffee.economy.Currency
import com.ulfric.lib.coffee.economy.Price
import com.ulfric.lib.coffee.economy.MoneyFormatter
import org.apache.commons.lang3.RandomUtils

Player player = event.getPlayer()

BankAccount account = Bank.getAccount player.getUniqueId()

Currency currency = Currency.valueOf '$'

int amount = RandomUtils.nextInt 1000, 1000000

account.give Price.of(currency, amount), "LuckyBlock Small Reward"

player.sendLocalizedMessage "luckyblock.money_small", new MoneyFormatter(amount).duelFormatLetter().toString()