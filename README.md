# Statki
Gra w plywanie statkami
Projekt 3
(12 pkt)
.
Program, który pozwalać przemieszczać się statkiem po morzu. Morze ma
wyspy na które statek nie może wpłynąć. Wymagania do tego programu są następujące:
•
Określone są punkt początkowy(x,y) statku oraz jego kierunek (N - północ, S - południe, E
- wschód, W - zachód).
•
Dodaj obsługę poleceń przesuwających statek naprzód (n) i wstecz (w).
•
Dodaj polecenia powodujące obrót statku w lewo (l) i prawo (p).
•
Statek przyjmuje łańcuch znaków z poleceniami (literami: n,w,l,p oznaczającymi naprzód,
wstecz, lewo, prawo).
•
Dodaj obsługę wykrywania lądu. Wykrywanie powinno odbywać się przed każdym ruchem na
nową pozycję. Jeśli polecenie wymaga wpłynięcia na ląd, statek ma anulować ruch, pozostać
na obecnej pozycji i zgłosić napotkane przeszkody.
Pod ocenę będą brane pod uwagę następujące elementy:
•
(1 pkt) Kompilacja i uruchomienie bezbłędne projektu.
•
(2 pkt) Uwzględnienie powyższych wymagań.
•
(4 pkt) Przypadki testowe.
•
(1 pkt) Użycie różnych asercji.
•
(1 pkt) Uwzględnienie wyjątków.
•
(1 pkt) Zastosowanie biblioteki Hamcrest.
•
(1 pkt) Pokrycie kodu.
•
(1 pkt) Styl kodu.
Ponadto pod ocenę (jako punkty dodatkowe) jest brane również: (Brak tych elementów: -1 pkt za
podpunkt od obowiązkowej punktacji zadania!)
•
Zastosowanie TDD (1 pkt).
•
Historia projektu w repozytorium (1 pkt).
