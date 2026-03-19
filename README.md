# apbd-cw1-git-s33974
Zadanie 5:
Merge nie był fast-forward, ponieważ na obu merge'owanych gałęziach zaszły niezależne zmiany. Gdyby gałąź main nie została zmieniona, merge zostałby wykonany przez fast-forward.

Odpowiedzi na pytania:
1. Kiedy Git wykona fast-forward, a kiedy powstaje merge commit?

   - Git wykona fast-forward kiedy główna gałąź (do której merge'ujemy) nie zawiera różnic od źródła feature-branchu, oraz nie zaaplikujemy flagi --no-ff w git merge. Fast-forward tworzy prostą linię z rozwidlenia, kiedy na drugiej gałęzi nic nie ma.
2. Czym w praktyce różni się merge od rebase?
    - Merge to commit, który łącząc, zachowuje historię obu gałęzi jako osobnych bytów (za wyjątkiem ff, który upraszcza historię w miejscu, w którym w zasadzie nie ma dwóch gałęzi do rozróżnienia). Rebase przepisuje historię jednej gałęzi na drugą, wykonując na niej commity z przepisywanej gałęzi.
3. W jaki sposób został rozwiązany konflikt w Twoim repozytorium?
    - Dwie gałęzie różniły się w tym samym miejscu. Rozwiązałem problem odrzucając zmianę z gałęzi feature-conflict i akceptując zmianę z main. Zależało mi na przetestowaniu interfejsu rozwiązywania konfliktów IntelliJ IDEA.