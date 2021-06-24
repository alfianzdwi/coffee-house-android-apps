package com.dicoding.coffehouse

object CoffeeData {
    private val coffeeNames = arrayOf(
        "Espresso Coffee",
        "Americano Coffee",
        "Ristretto Coffee",
        "Macchiatto Coffee",
        "Mochachino Coffee",
        "Red Eye Coffee",
        "Cortado Coffee",
        "Coffee Late",
        "Cappuchino",
        "Flat White",
        "Affogato",
        "Cold Brew",
    )

    private val coffeeImages = intArrayOf(
        R.drawable.espressso,
        R.drawable.americanooo,
        R.drawable.ristretto,
        R.drawable.cfmachiattooo,
        R.drawable.mochachinooo,
        R.drawable.reddeye,
        R.drawable.cortado,
        R.drawable.coffeelatte,
        R.drawable.cfcapucino,
        R.drawable.flatwhitee,
        R.drawable.affogato,
        R.drawable.coldbreww,
    )

    private val coffeePrice = intArrayOf(
        35000,
        27500,
        30000,
        32500,
        27000,
        45000,
        25000,
        40000,
        38000,
        29000,
        35000,
        30000,
    )

    private val coffeeDetails = arrayOf(
        "Espresso : Jenis kopi ini merupakan kopi murni tanpa menggunakan campuran bahan apapun seperti susu atau gula. Espresso merupakan salah satu jenis minuman kopi yang mulai dikenal di Italia. Espresso dibuat dengan mesin brewing khusus. Cara membuatnya adalah biji kopi diletakkan di dalam mesin brewing, lalu air dialirkan dengan tekanan tinggi. Proses ini menghasilkan ekstrak kopi. Jenis minuman kopi paling dasar ini biasanya disajikan dalam cangkir khusus espresso berukuran 30 mililiter sampai 118 mililiter. Espresso bertekstur pekat dan pahit, dengan buih putih di atasnya yang terbentuk dari tekanan minyak dalam biji kopi.",
        "Americano : pada dasarnya sama dengan espresso, tetapi menggunakan lebih banyak air. Jadi rasa kopinya tidak terlalu kental dan tidak terlalu kuat. Americano terdiri dari satu shot espresso yang dituangkan dalam cangkir berukuran 178 mililiter yang dicampur dengan air panas hingga memenuhi gelas. Jenis minuman kopi ini nikmat disantap dalam keadaan panas maupun dingin.",
        "Ristrettro : Berbeda dengan Americano, jenis minuman kopi ini menggunakan air yang lebih sedikit. Nama ristretto berasal dari Bahasa Italia yang berarti “terbatas”. Ristretto sering juga disebut sebagai half espresso karena air yang digunakan dibatasi dan volume kopi yang dihasilkan ristretto hanya setengah dari espresso. Ristretto lebih pekat, singkat dan manis. Meski begitu waktu press dalam pembuatan ristretto sama dengan espresso.",
        "Macchiato : adalah minuman kopi yang dibuat dengan mencampurkan espresso dengan susu.Ada dua jenis macchiato yang biasanya disajikan, yaitu espresso macchiato dan latte macchiato. Espresso macchiato dibuat dengan menambahkan sedikit susu ke dalam segelas espresso. Sedangkan apabila espresso yang ditambahkan ke dalam segelas susu, maka minuman tersebut disebut dengan latte macchiato.",
        "Mochachino : adalah minuman kopi yang terbuat dari campuran espresso dengan coklat dan susu. Saat ini campuran Mocha-Java biasa dicampur dengan varietas lainnya untuk menciptakan ciri khas yang unik. Banyak perusahaan kopi yang memiliki campurannya tersendiri. Komposisinya diracik dari bubuk cokelat, kopi Vienna, susu panas & busa. Di Eropa, biasanya dikenal sebagai Moccacino.",
        "Red Eye : Jenis minuman kopi yang satu ini terdiri dari espresso dicampur dengan kopi hitam. Jenis kopi ini biasanya lebih popular dengan sebutan coffee with espresso. Di beberapa negara jenis kopi ini memiliki banyak nama antara lain black eye, a shot in the dark dan eye opener.",
        "Cortado : Jenis minuman kopi yang satu ini berasal dari Spanyol dan dari asal kata “cortado” berarti “memotong”. Cortado terdiri dari espresso dan susu hangat. Perbandingan rasio susu pada jenis kopi ini adalah 1:1 atau di beberapa tempat bisa menjadi 1:2. Di Italia (atau di negara lain) cortado sering disebut-sebut mirip dengan macchiato. Hal ini karena komposisi jenis kopi ini mirip.",
        "Latte atau Caffè latte : adalah espresso atau kopi yang dicampur dengan susu dan memiliki lapisan busa yang tipis di bagian atasnya. Perbandingan antara susu dengan kopi pada caffè latte adalah 2:1.",
        "Capuchinno : Jenis minuman kopi satu ini termasuk yang paling populer di kedai kopi. Cappuccino adalah olahan espresso yang paling banyak digemari, terutama bagi penikmat kopi dengan rasa lebih mild. Minuman ini terdiri dari espresso dan steamed milk dengan rasio 1:1. Namun, ada juga yang memakai perbandingan 1/3 espresso, 1/3 steamed milk, dan 1/3 susu foam.",
        "Flat White adalah cara menyiapkan kopi dengan menuangkan susu panas ke secangkir espresso dan menciptakan pola atau desain di permukaan latte. Selain itu bisa pula dengan langung \"menggambar\" di lapisan atas busa. Seni latte sulit dibuat secara konsisten, karena dibutuhkan kondisi yang tepat antara espresso dan susu",
        "Affogato : merupakan jenis minuman kopi yang mencampurkan espresso yang kuat dan pahit dengan es krim vanilla yang nikmat. Jenis minuman kopi ini tercipta dari 2/5 esspresso yang dipadukan dengan 3/5 es krim. Jenis kopi ini menghadirkan sebuah kenikmatan paling pas dari perkawinan rasa manis es krim dan pahit sempurnanya espresso.",
        "Cold Brew : Jenis minuman kopi ini didaptkan dari mencampur hasil gilingan kopi dengan air dingin di satu wadah. Lalu, dibiarkan selama 12 jam atau sampai satu hari penuh, kemudian disaring. Rasa yang dihasilkan cold brew cenderung tidak terlalu pahit dan tidak terlalu asam."
    )

    //
    val listData : ArrayList<Coffee>
        get() {
            val list = arrayListOf<Coffee>()
            for (position in coffeeNames.indices){
                val coffee = Coffee()

                coffee.name = coffeeNames[position]
                coffee.price = coffeePrice[position]
                coffee.detail = coffeeDetails[position]
                coffee.photo = coffeeImages[position]
                list.add(coffee)
            }
            return list
        }
}