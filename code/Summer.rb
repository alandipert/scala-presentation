class Summer

  def initialize(args)
    @args = args
  end

  def calcSum(arr)
    arr.inject { |x,y| x + y }
  end

  def convertInput(str)
    str.split(",").map { |x| x.to_i }
  end

  def result
    puts calcSum(convertInput(@args))
  end

end

if ARGV[0]
  Summer.new(ARGV[0]).result
else
  puts "Please provide a list of integers in the format 1,2,3"
end
