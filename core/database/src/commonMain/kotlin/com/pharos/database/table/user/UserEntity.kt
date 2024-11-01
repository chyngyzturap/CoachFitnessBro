package com.pharos.database.table.user

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
{
  "user": {
    "age": 25, 
    "height_cm": 175, 
    "weight_kg": 70, 
    "experience_level": "novice", 
    "training_frequency_per_week": 3, 
    "injuries_or_conditions": "No", 
    "goal": "muscle_gain",
    "optional": {
      "sleep_hours": "6-8",
      "stress_level": "medium",
      "preferred_training_location": "gym",
      "available_equipment": ["dumbbells", "resistance_bands"],
      "cardio_preference": "prefer_strength",
      "diet_following": "calorie_counting",
      "preferred_training_time": "evening"
    }
  }
}
*/

@Entity
data class UserEntity(
    @PrimaryKey val id: Int = 1,
    var age: Int? = null,
    var experience_level: String? = null,
    var goal: String? = null,
    var height_cm: Int? = null,
    var injuries_or_conditions: String? = null,
//    var optional: Optional? = null,
    var training_frequency_per_week: Int? = null,
    var weight_kg: Int? = null
) {
        data class Optional(
            var available_equipment: List<String?>? = null,
            var cardio_preference: String? = null,
            var diet_following: String? = null,
            var preferred_training_location: String? = null,
            var preferred_training_time: String? = null,
            var sleep_hours: String? = null,
            var stress_level: String? = null
        )
}