echo "-> Run bash individually - Type 'MavenProjectbuild' to build the project"
MavenProjectbuild() {
  echo "mvn clean package"
  mvn clean package
}
echo "-> Run bash individually - Type 'MavenProjectk8s' to run the executable"
MavenProjectk8s() {
  echo "Running executable > mvn k8s:resource k8s:build"
  mvn k8s:resource k8s:build
}
echo "-> Run bash individually - Type 'MavenProjectregistryk8s' to run the executable"
MavenProjectk8sregistry() {
  echo "Running executable > mvn k8s:resource k8s:build k8s:push -Pregistry-k8s"
  mvn k8s:resource k8s:build k8s:push -Pregistry-k8s
}
echo "-> Run bash individually - Type 'MavenProjectrun' to run the executable"
MavenProjectrun() {
  echo "Running executable > mvn spring-boot:run"
  mvn spring-boot:run
}
