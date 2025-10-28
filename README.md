# Description:

Es ist Haloween und eine Gruppe von Kindern steht vor Deinem Haus und schreit "Süßes oder Saures!".
Deshalb musst Du ihnen etwas geben damit sie weiterziehen.
Doch wehe wenn die Kinder nicht zufrieden sind... dann gibt es Saures und zwar für Dich!

## Argumente:

**numberChildren**: Anzahl der Kinder, mindestens 2

**bags**: Tüten mit Dingen wie z.B.: `[["candy","apple","candy"],["candy","candy"],["candy","candy"]]`

# Ergebnisse:

Wenn die Kinder bekommen was sie wollen rufen sie "Danke liebe/r Entwickler:in!"

Aber wehe Sie bekommen nicht was sie sollen, denn dann rufen sie "Das gibt Saures!" und werfen Eier auf Dich.

Aber wie lassen sich die Kinder zufrieden stellen?

1) Jedes Kind bekommt mindestesn 2 Süßigkeiten
2) Jedes Kind bekomment die selbe Anzhal von Süßigkeiten
3) Kein Kind erhält die "Bombe" (Die Bombe ist ein Lehrbuch über Informatik)

# Randbedingungen
- Tüten können nicht aufgeteilt oder deren Inhalt getauscht werden
- Alle Argumente sind gültig z.b: keine leeren Tüten

# Beispiele
trickOrTreat(3,[["candy","apple","candy"],["candy","candy"],["candy","candy"]])
sollte zurückgeben: "Danke liebe/r Entwickler:in!" (Der Apfel kann ignoriert werden)

trickOrTreat(3,[["candy","apple"],["apple","candy"],["candy","apple"]])
sollte zurückgeben: "Das gibt Saures!"(Jedes Kind hat nur eine Süßigkeit)

trickOrTreat(3,[["candy","apple","candy"],["candy","candy"],["candy","candy","candy"]])
sollte zurückgeben: "Das gibt Saures!"(Die Anzahl der Süßigkeiten sind unterschiedlich)

trickOrTreat(3,[["candy","apple","candy"],["candy","candy"]])
sollte zurückgeben: "Das gibt Saures!"(Ein Kind hat keine Süßigkeiten bekommen)

trickOrTreat(3,[["candy","apple","candy"],["candy","candy"],["candy","bomb","candy"]])
sollte zurückgeben: "Das gibt Saures!"(Ein Kind hat die Bombe erhalten)
