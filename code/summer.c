#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct num_list {
  int size;
  int *nums;
} num_list;

int calc_sum(struct num_list *nlist) {
  int i, sum = 0;
  for(i = 0; i < nlist->size; i++) sum += nlist->nums[i];
  return sum;
}

struct num_list * convert_input(char *input) {
  struct num_list *nlist = (struct num_list*)malloc(sizeof(struct num_list));
  nlist->nums = (int*)malloc(100);
  int count = 0;
  char *token = strtok(input, ",");
  nlist->nums[count++] = atoi(token);
  while (token = strtok(NULL, ",")) nlist->nums[count++] = atoi(token);
  nlist->size = count;
  return nlist;
}

int main(int argc, char **argv) {
  if(argc > 1) {
    printf("%i\n", calc_sum(convert_input(argv[1])));
  } else {
    fprintf(stderr, "Please provide a list of integers in format 1,2,3\n");
  }
  return 0;
}
