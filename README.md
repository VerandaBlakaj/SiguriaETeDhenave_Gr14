# SiguriaETeDhenave_Gr14

Kriptografia është shkenca metematiko teknike për ruajtjen e sigurisë së shënimeve.
Për implementimin e këtij projekti është përdorur editori Eclipse IDE, dhe gjuha programuese Java.
Ideja e implementimit te Beale cipher:
Beale cipher eshte perdorur per enkriptimin e nje letre nga Beale i cili permes asaj letre ka dashtur te tregoj se ku qendron thesari te cilin e ka fshehur ai, secila shkronje ne ate "testament" eshte enkriptuar me numra te cilet gjenden ne liber ku secili numer eshte zevendesuar me nje shkronje ne liber, deri me sot ende nuk eshte gjendur ai thesar.

1.Ne nje liber(textdocument) te cilin e kemi vendosur si textfile, gjenden fjal te ndryshme.
2.
3.Plaintext-i jepet nga perdoruesi i cili nuk eshte i kufizuar per gjatesin e stringut.
Logjika permes se ciles kemi punur projektin eshte qe perdoruesi jep nje plaintext i cili duhet te enkriptohet dhe dekriptohet, enkriptimi behet permes klases Enkriptimi ne te cilen jane perdorur 3 unaza. Unaza e pare iteron ne plaintext nga shkronja e par ajo shkronje bartet ne unazen e dyte e cila eshte perdorur me qellim qe te bej gjej se cila fjal ne liber(textdocument) fillon me at shkronje. Merret indeksi i fjales dhe bartet ne nje unaz e cila gjen poziten e shkronjes se pare te asaj fjale.

Plaintexti jipet nga perdoruesi per fjalin qe deshiron ta dekriptoj, gjithashtu edhe celsi qe ne rastin e ketij projekti eshte path-i i vendndodhjes se librit(textdocument).
Perdoruesi duhet ta cek kur deshiron te bej enkriptim e kur dekriptim permes komandave encrypt dhe decrypt respektivisht.

Nje shembull:
Per enkriptim:
encrypt "./src/libri.txt" "albin izmaku"

Per dekriptim: 
decrypt "./src/libri.txt" "28, 16, 22, 72, 107, -1, 72, 84, 89, 28, 98, 52"

Ne kete projekt eshte perdorur built-in funksioni Random() i cili muneson per zgjedhjen e fjalve me shkronje te pare random. Pasi qe ne liber(textdocument) ndodh qe shum fjal fillojne me shkronje te njejt dhe permes algoritmit i cili eshte perdorur ne built-in funkrionit behet e mundur qe ato indekse te zgjidhen rastesisht.


