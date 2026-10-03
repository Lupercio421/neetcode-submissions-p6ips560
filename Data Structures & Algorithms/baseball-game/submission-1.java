
class Solution {
    public int calPoints(String[] operations) {
        List<Integer> scores = new ArrayList<>();

        for (String operation : operations) {
            switch (operation) {
                case "D" -> {
                    int previousScore = scores.get(scores.size() - 1);
                    scores.add(previousScore * 2);
                }
                case "+" -> {
                    int lastScore = scores.get(scores.size() - 1);
                    int secondLastScore = scores.get(scores.size() - 2);
                    scores.add(lastScore + secondLastScore);
                }
                case "C" -> scores.remove(scores.size() - 1);
                default -> scores.add(Integer.parseInt(operation));
            }
        }

        return scores.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
