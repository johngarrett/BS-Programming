
#include <stdio.h>
int main()
{
	float film_price;
	int shots_per_roll;
	int num_rolls;
	float pack_cost;
	float scan_price;
	const float sales_tax = .07;
	char response = 'y';
	
	printf("\nThis program assumes you are scanning yourself and developing at biggs camera's\n\n$4.99 per roll\n");
	
	scan_price = 4.99;
	
	while (response != 'n'){
		printf("\nHow many shots are in your roll of film? ");
			scanf("%d", &shots_per_roll);
		printf("How many rolls come in a pack? ");
			scanf("%d", &num_rolls);
		printf("How much did the pack cost? $");
			scanf("%f", &pack_cost);
		
		film_price = pack_cost / num_rolls;
		
		float cost = shots_per_roll / film_price;
		cost += (scan_price / shots_per_roll);
		cost *= sales_tax;
		
		printf("\n\nThe cost per shot is $%0.2f,", cost);
		
		printf("\nCalculate again (y/n)? ");
		scanf("%s", &response);

	}
	
	return 0;
}
