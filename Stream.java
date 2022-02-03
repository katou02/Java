List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
integerList.stream() // streamの取得
        .sorted(Comparator.reverseOrder()) // 中間操作
        .forEach(i -> System.out.println(i)); // 終端操作