As discussed in the problem statement, a person is driving and based on his speed limit he will pay insurance fee.
In different waypoints we are getting different data for:
   latitude
   longitude
   speed
   speed_limit
   timestamp
To decide out his insurace fee, we need to find out:
   total distance
   total duration
   distance speeding
   duration speeding
If we consider data of two waypoints let assume A and B
Total duration will be difference between timestamp at both points.
For calculating speeding distance and speeding time,car speed should always be greater then speed limit.
For total distance we first check acceleraion and based on that calculate distance(assuming constant acceleration).

So at the final waypoint we will have multiple speeding distance and speeding duration which will be added to give the cumulative duration and distance.
