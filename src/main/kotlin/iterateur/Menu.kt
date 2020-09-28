package iterateur

interface Menu {
    fun creeIterateur(): Iterator<Plat>
}