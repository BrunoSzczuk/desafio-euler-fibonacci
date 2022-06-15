package br.com.bruno.desafioeuler

import java.math.BigDecimal

class Desafio {
    companion object {

        //https://www.hackerrank.com/contests/projecteuler/challenges/euler230/problem
        fun fibonacciWords(wordA: String, wordB: String, index: Long): String {
            val palavras = mutableListOf<Pair<String, Long>>()
            palavras.add(Pair(wordA, wordA.length.toLong()))
            palavras.add(Pair(wordB, wordB.length.toLong()))
            while (palavras.last().second.toLong() < index) {
                /*
                 val novaPalavra = palavras[palavras.size - 2].first + palavras[palavras.size - 1].first
                 palavras.add(Pair(novaPalavra, novaPalavra.length.toBigDecimal()))
                 só da pra descomentar isso daqui se não rodar o último teste da fibonacci, se não dá overflow
                 */


                //vai montando quantos caracteres cada índice da fibonacci tem
                palavras.add(Pair("", palavras[palavras.size - 2].second + (palavras[palavras.size - 1].second)))
            }
            var diffTamanho = index
            var indice = palavras.size - 1
            while (indice > 1) {
                //O -2 vem porque somente os 2 primeiros indices é quem tem palavra, o resto é apenas fibonacci
                //O objetivo é desconstruir os caracteres de traz pra frente pra saber o que resta, já que a "cauda" é justamente o fibonnaci das 2 primeiras palavras
                if (palavras[indice - 2].second.toLong() < diffTamanho) {
                    diffTamanho -= palavras[indice - 2].second.toLong()
                    indice--
                } else {
                    //esse trecho só é executado 1x, quando o índice buscado está na primeira palavra, ai o índice fica 0
                    indice -= 2
                }
            }
            return if (indice == 0) {
                palavras.first().first[diffTamanho.toInt() - 1].toString()
            } else
                palavras[1].first[diffTamanho.toInt() - 1].toString()

        }


    }
}