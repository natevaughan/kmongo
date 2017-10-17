package com.natevaughan.kpattern

import com.natevaughan.kmongo.Board
import org.junit.Test
import org.junit.Assert.*
import org.slf4j.LoggerFactory

/**
 * Created by nate on 10/13/17
 */
class BoardTest {
    companion object {
        val log = LoggerFactory.getLogger(BoardTest::class.java)
    }

    @Test
    fun test() {
        val size = Math.floor(Math.random() * 20 + 5).toInt()
        val board = Board(size, 0.5)
        assertNotNull(board)
        log.info(com.natevaughan.kmongo.print(board))
    }
}