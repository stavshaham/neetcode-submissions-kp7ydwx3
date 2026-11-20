class Solution:
    def findMin(self, nums: List[int]) -> int:
        minimum = nums[0]
        left = 0
        right = len(nums) - 1

        while left <= right:
            if (nums[right] > nums[left]):
                minimum = min(minimum, nums[left])
                break
            
            mid = (left + right) // 2
            minimum = min(minimum, nums[mid])
            if (nums[mid] >= nums[left]): 
                left = mid + 1
            else:
                right = mid - 1

        return minimum