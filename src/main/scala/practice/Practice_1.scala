package practice

class Practice_1 (val age: Int)

object Practice_1 {

  def echoAnklebiter(practice: Practice_1) = {
    val isSchoolStarted: Boolean = practice.age > 6
    if (isSchoolStarted) {
      println("幼児です")
    } else {
      println("幼児ではありません")
    }
  }
}

