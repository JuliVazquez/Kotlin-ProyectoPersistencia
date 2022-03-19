package ar.edu.unq.epers.tactics.service

import ar.edu.unq.epers.tactics.modelo.Aventurero
import ar.edu.unq.epers.tactics.modelo.Pelea
import ar.edu.unq.epers.tactics.modelo.habilidades.Habilidad

interface PeleaService {
    fun iniciarPelea(idPartyA: Long, idPartyB: Long) : Pelea
    fun estaEnPelea(partyId: Long):Boolean
    fun resolverTurno(idPelea:Long, idAventurero:Long): Habilidad
    fun recibirHabilidad(idPelea:Long, idAventurero:Long, habilidad: Habilidad): Aventurero
    fun terminarPelea(idDeLaPelea: Long): Pelea
    fun recuperarPelea(idDeLaPelea :Long): Pelea

    fun recuperarOrdenadas(partyId:Long, pagina:Int?):PeleasPaginadas
}

class PeleasPaginadas(var peleas:List<Pelea>, var total:Int)