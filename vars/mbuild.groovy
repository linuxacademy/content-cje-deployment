def call(args){
  sh "${tool 'M3'}/bin/mvn ${args}"
}
