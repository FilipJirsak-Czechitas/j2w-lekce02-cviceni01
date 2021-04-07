[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Datum a čas</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link rel="icon" type="image/png" href="/images/favicon.png">
</head>
<body>
<div class="container">
    <header class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
        <ul class="nav nav-pills">
            <li class="nav-item"><a href="/" class="nav-link">Domů</a></li>
            <!-- Třída „active“ se přesunula na tlačítko „Datum“, aby bylo na stránce modré. -->
            <li class="nav-item"><a href="/datum" class="nav-link active">Datum</a></li>
            <li class="nav-item"><a href="/cas" class="nav-link">Čas</a></li>
        </ul>
    </header>
    <div class="px-4 py-5 my-5 text-center">
        <!-- Do elementu <h1> chceme vložit atribut „datum“ z modelu. -->
        <h1 class="display-1 fw-bold">Dnes je ${datum?date}.</h1>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>
