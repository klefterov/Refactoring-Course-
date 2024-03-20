package jetbrains.refactoring.course.extracting

private const val speedOfLight = 299792458.0

private const val waveLength = 6.62607015e-34

fun calculatePhotonEnergy(waveLength: Double): Double {
    val frequency = speedOfLight / waveLength
    return waveLength * frequency
}

fun calculatePhotonMass(energy: Double): Double {
    return energy / (speedOfLight * speedOfLight)
}

private const val plankConstant = 0.5e-6

fun main() {
    val photonEnergy = calculatePhotonEnergy(plankConstant)
    val photonMass = calculatePhotonMass(photonEnergy)

    println("Photon energy: $photonEnergy Joules")
    println("Photon mass: $photonMass kg")
}
