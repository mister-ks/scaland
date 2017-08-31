class Counter(start: Int, finish: Int, count: Int) {
  def counter() {
    if (start < finish) {
      start = start + count
      return start
    }
  }
}
