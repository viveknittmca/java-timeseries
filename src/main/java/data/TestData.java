package data;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import timeseries.TimePeriod;
import timeseries.TimeSeries;
import timeseries.TimeUnit;
import timeseries.Ts;

/**
 * Static methods for retrieving test data.
 * 
 * @author Jacob Rachiele
 *
 */
public final class TestData {

  private TestData() {}

  public static double[] ausbeer() {
    return new double[] { 284, 213, 227, 308, 262, 228, 236, 320, 272, 233, 237, 313, 261, 227, 250, 314, 286, 227, 260,
            311, 295, 233, 257, 339, 279, 250, 270, 346, 294, 255, 278, 363, 313, 273, 300, 370, 331, 288, 306, 386,
            335, 288, 308, 402, 353, 316, 325, 405, 393, 319, 327, 442, 383, 332, 361, 446, 387, 357, 374, 466, 410,
            370, 379, 487, 419, 378, 393, 506, 458, 387, 427, 565, 465, 445, 450, 556, 500, 452, 435, 554, 510, 433,
            453, 548, 486, 453, 457, 566, 515, 464, 431, 588, 503, 443, 448, 555, 513, 427, 473, 526, 548, 440, 469,
            575, 493, 433, 480, 576, 475, 405, 435, 535, 453, 430, 417, 552, 464, 417, 423, 554, 459, 428, 429, 534,
            481, 416, 440, 538, 474, 440, 447, 598, 467, 439, 446, 567, 485, 441, 429, 599, 464, 424, 436, 574, 443,
            410, 420, 532, 433, 421, 410, 512, 449, 381, 423, 531, 426, 408, 416, 520, 409, 398, 398, 507, 432, 398,
            406, 526, 428, 397, 403, 517, 435, 383, 424, 521, 421, 402, 414, 500, 451, 380, 416, 492, 428, 408, 406,
            506, 435, 380, 421, 490, 435, 390, 412, 454, 416, 403, 408, 482, 438, 386, 405, 491, 427, 383, 394, 473,
            420, 390, 410 };
  }

  public static TimeSeries ausbeerSeries() {
    return Ts.newQuarterlySeries(1956, 1, 284, 213, 227, 308, 262, 228, 236, 320, 272, 233, 237, 313, 261, 227, 250, 314, 286, 227, 260, 311, 295, 233, 257, 339, 279, 250, 270, 346, 294, 255, 278, 363, 313, 273, 300, 370, 331, 288, 306, 386, 335, 288, 308, 402, 353, 316, 325, 405, 393, 319, 327, 442, 383, 332, 361, 446, 387, 357, 374, 466, 410, 370, 379, 487, 419, 378, 393, 506, 458, 387, 427, 565, 465, 445, 450, 556, 500, 452, 435, 554, 510, 433, 453, 548, 486, 453, 457, 566, 515, 464, 431, 588, 503, 443, 448, 555, 513, 427, 473, 526, 548, 440, 469, 575, 493, 433, 480, 576, 475, 405, 435, 535, 453, 430, 417, 552, 464, 417, 423, 554, 459, 428, 429, 534, 481, 416, 440, 538, 474, 440, 447, 598, 467, 439, 446, 567, 485, 441, 429, 599, 464, 424, 436, 574, 443, 410, 420, 532, 433, 421, 410, 512, 449, 381, 423, 531, 426, 408, 416, 520, 409, 398, 398, 507, 432, 398, 406, 526, 428, 397, 403, 517, 435, 383, 424, 521, 421, 402, 414, 500, 451, 380, 416, 492, 428, 408, 406, 506, 435, 380, 421, 490, 435, 390, 412, 454, 416, 403, 408, 482, 438, 386, 405, 491, 427, 383, 394, 473, 420, 390, 410);
  }

  public static TimeSeries livestock() {
    return Ts.newAnnualSeries(1961, 232.288994, 229.536258, 233.145936, 243.763684, 252.602916, 259.677371, 260.766892, 269.784084, 266.414974, 263.917747, 268.307222, 260.662556, 266.639419, 277.515778, 283.834045, 290.309028, 292.474198, 300.830694, 309.286657, 318.331081, 329.37239, 338.883998, 339.244126, 328.600632, 314.255385, 314.459695, 321.413779, 329.789292, 346.385165, 352.297882, 348.370515, 417.562922, 417.12357, 417.749459, 412.233904, 411.946817, 394.697075, 401.49927, 408.270468, 414.2428, 407.997978, 403.460832, 413.824928, 428.104959, 445.338742, 452.994173, 455.74017);
  }

  public static TimeSeries elecSales() {
    return Ts.newAnnualSeries(1989, 2354.34, 2379.71, 2318.52, 2468.99, 2386.09, 2569.47, 2575.72, 2762.72, 2844.5, 3000.7, 3108.1, 3357.5, 3075.7, 3180.6, 3221.6, 3176.2, 3430.6, 3527.48, 3637.89, 3655);
  }

  public static TimeSeries debitcards() {
    return Ts.newMonthlySeries(2000, 1,
            new double[] { 7204, 7335, 7812, 7413, 9136, 8725, 8751, 9609, 8601, 8930, 8835, 11688, 8078, 7892, 8151,
                    8738, 9416, 9533, 9943, 10859, 8789, 9960, 9619, 12900, 8620, 8401, 8546, 10004, 10675, 10115,
                    11206, 11555, 10453, 10421, 9950, 13975, 9315, 9366, 9910, 10302, 11371, 11857, 12387, 12421, 12073,
                    11963, 10666, 15613, 10586, 10558, 12064, 11899, 12077, 13918, 13611, 14132, 13509, 13152, 13993,
                    18203, 14262, 13024, 14062, 14718, 16544, 16732, 16230, 18126, 16016, 15601, 15394, 20439, 14991,
                    14908, 17459, 14501, 18271, 17963, 17026, 18111, 15989, 16735, 15949, 20216, 16198, 15060, 16168,
                    16376, 18403, 19113, 19303, 20560, 16621, 18788, 17970, 22464, 16658, 16214, 16043, 16418, 17644,
                    17705, 18107, 17975, 17598, 17658, 15750, 22414, 16065, 15467, 16297, 16530, 18410, 20274, 21311,
                    20991, 18305, 17832, 18223, 23987, 15964, 16606, 19216, 16419, 19638, 19773, 21052, 22011, 19039,
                    17893, 19276, 25167, 16699, 16619, 17851, 18160, 22032, 21395, 22217, 24565, 21095, 20114, 19931,
                    26120, 18580, 18492, 19724, 20123, 22582, 22595, 23379, 24920, 20325, 22038, 20988, 26675 });
  }

  public static TimeSeries hardProblem() {
    return Ts.newMonthlySeries(2015, 1, 5.173611, -3.284118, 1.214674, -0.141098, -1.073575, 5.715716, -7.605208, 5.926136, -4.938447, 3.151199, 2.474336, 4.76872, -6.443497, -2.104208, 4.770969, -2.881476, 2.190094, 0.691383, -1.679072, 0.987689, 1.363952, 0.611427, 0.558259, -6.343297, 4.797348, 1.975379, -4.703283, 2.38436, -4.453804, 5.173611, -4.498792, 3.46407, -3.292298, 0, 1.222854);
  }

  public static TimeSeries ukcars() {
    return Ts.newQuarterlySeries(1977, 1, 330.371, 371.051, 270.67, 343.88, 358.491, 362.822, 261.281, 240.355, 325.382, 316.7, 171.153, 257.217, 298.127, 251.464, 181.555, 192.598, 245.652, 245.526, 225.261, 238.211, 257.385, 228.461, 175.371, 226.462, 266.15, 287.251, 225.883, 265.313, 272.759, 234.134, 196.462, 205.551, 291.283, 284.422, 221.571, 250.697, 253.757, 267.016, 220.388, 277.801, 283.233, 302.072, 259.72, 297.658, 306.129, 322.106, 256.723, 341.877, 356.004, 361.54, 270.433, 311.105, 326.688, 327.059, 274.257, 367.606, 346.163, 348.211, 250.008, 292.518, 343.318, 343.429, 275.386, 329.747, 364.521, 378.448, 300.798, 331.757, 362.536, 389.133, 323.322, 391.832, 421.646, 416.823, 311.713, 381.902, 422.982, 427.722, 376.85, 458.58, 436.225, 441.487, 369.566, 450.723, 462.442, 468.232, 403.636, 413.948, 460.496, 448.932, 407.787, 469.408, 494.311, 433.24, 335.106, 378.795, 387.1, 372.395, 335.79, 397.08, 449.755, 402.252, 391.847, 385.89, 424.325, 433.28, 391.213, 408.74, 445.458, 428.202, 379.048, 394.042, 432.796);
  }

  public static TimeSeries sydneyAir() {
    double[] syd = new double[] { 1.912, 1.848, 1.856, 2.142, 2.118, 2.048, 2.111, 2.199, 2.231, 2.081, 2.213, 2.131,
            2.147226, 2.131, 2.034, 2.19, 2.262, 2.579, 2.367, 2.432, 2.64, 2.614, 2.569, 2.523, 2.26, 1.117, 0.59,
            0.966, 1.235, 2.001, 1.696, 2.089, 2.716, 2.483, 2.461, 2.533, 2.273, 2.273, 2.37, 1.782, 1.385, 2.322,
            2.34, 2.203, 2.3, 2.125, 2.345, 2.224, 1.952, 2.212, 2.028, 1.906, 1.834, 1.797, 1.869, 1.886, 2.131, 2.021,
            2.199, 2.14, 2.19, 1.917, 2.096, 2.254, 2.251, 2.072, 0.993, 1.675, 1.463, 2.256, 2.216, 2.218, 2.568,
            2.483, 2.545, 2.599, 2.483, 1.793, 0.516, 0.873, 1.195, 1.525, 1.906, 2.246, 2.247, 2.316, 2.276, 2.403,
            2.432, 2.49, 2.013, 1.508, 2.251, 2.079, 2.21, 1.96, 2.251, 2.013, 2.252, 2.067, 1.831, 2.069, 1.953, 2.199,
            1.771, 1.696, 1.788, 1.636, 1.741, 1.597, 1.943, 1.66, 0.616, 0, 0, 0, 0, 0, 0, 0, 0.053, 0.04, 0.354,
            0.505, 0.711, 0.723, 0.796, 0.856, 0.845, 0.807, 0.276, 0.339, 0.581, 0.894, 0.936, 1.111, 1.446, 1.517,
            1.513, 1.508, 1.636, 1.38, 1.453, 1.459, 1.538, 1.327, 1.027, 1.365, 1.475, 1.365, 1.351, 1.231, 1.447,
            1.408, 1.089, 1.357, 1.287, 1.087, 1.017, 1.09, 1.343, 1.164, 1.169, 1.465, 1.242, 1.22, 1.231, 1.266,
            1.337, 1.079, 1.223, 1.351, 1.269, 1.382, 1.435, 1.371, 1.341, 1.399, 1.44, 1.236, 1.441, 0.988, 0.3, 0.401,
            0.529, 0.786, 1.086, 0.725, 1.127, 1.146, 1.086, 1.134, 1.02, 1.022, 1.224, 0.895, 0.658, 0.977, 0.916,
            0.83, 0.99, 0.77, 0.801, 0.839, 0.835, 0.802, 0.763, 0.77, 0.838, 0.742, 0.793, 0.9, 0.96, 0.8, 0.807,
            0.841, 0.88, 0.818, 0.817, 0.819, 0.998, 1.22, 0.966, 0.895, 0.978, 0.913, 0.947, 1.002, 1.081, 0.977,
            1.027, 0.895, 0.9, 0.762, 0.329, 0.351, 0.419, 0.618, 0.845, 0.727, 1.2, 1.801, 1.727, 1.992, 1.865, 1.801,
            1.661, 2.366, 2.003, 2.092, 1.703, 1.337, 1.985, 1.808, 1.839, 1.714, 1.73, 1.725, 1.456, 1.447, 1.357,
            1.28, 1.363, 1.228, 1.411, 1.13, 1.153, 1.257, 1.259, 1.153, 1.202, 1.185, 1.247, 1.434, 1.45, 1.227, 1.245,
            1.417, 1.458, 1.398, 1.423, 1.358, 1.488 };
    return new TimeSeries(new TimePeriod(TimeUnit.WEEK, 1),
            OffsetDateTime.of(LocalDateTime.of(1987, 6, 22, 0, 0), ZoneOffset.ofHours(0)), syd);
  }

  public static TimeSeries internetTraffic() {
    double[] traffic = new double[] { 4838.665, 4845.177, 5157.996, 5637.876, 5520.69, 5626.337, 5350.546, 5356.983,
            5385.814, 5403.906, 5666.348, 5764.142, 5902.474, 6012.859, 5829.679, 5852.245, 6185.16, 5927.107, 5855.695,
            5866.18, 5905.206, 5848.887, 6016.66, 5936.597, 6169.697, 6313.159, 6264.738, 6385.849, 6478.062, 6524.345,
            6620.18, 6438.393, 6513.466, 6443.066, 6531.194, 6571.118, 6545.468, 6418.973, 6693.885, 6601.722, 6524.867,
            6446.837, 6550.387, 6263.461, 6315.622, 6299.67, 6317.647, 6362.241, 6664.304, 6437.558, 6594.328, 6543.169,
            6557.974, 6575.689, 6654.107, 6552.579, 6814.238, 6714.279, 6928.067, 6824.467, 6926.026, 6919.605,
            7061.944, 6862.193, 6880.208, 6746.61, 6719.177, 6672.826, 6701.45, 6562.534, 6516.693, 6534.142, 6644.532,
            6505.41, 6563.202, 6339.707, 6294.199, 6381.651, 6336.516, 6164.897, 6012.195, 5986.157, 6062.303, 5936.79,
            5877.61, 5895.719, 5722.355, 5790.587, 5703.702, 5576.885, 5519.508, 5435.709, 5482.644, 5359.547, 5365.521,
            5203.538, 5189.482, 5013.701, 5014.928, 5036.503, 5022.582, 4994.482, 5018.352, 4919.71, 4850.332, 4833.06,
            4730.52, 4834.666, 4800.652, 4697.796, 4750.136, 4637.712, 4683.585, 4587.269, 4534.205, 4461, 4553.044,
            4484.598, 4464.475, 4374.492, 4461.231, 4390.647, 4350.761, 4450.68, 4372.37, 4297.794, 4469.044, 4529.787,
            4509.028, 4385.334, 4323.397, 4390.798, 4419.036, 4287.826, 4217.421, 4164.421, 4163.41, 4221.105, 4210.767,
            4248.45, 4288.273, 4251.693, 4157.353, 4165.268, 4069.311, 4054.195, 4094.334, 4035.708, 3928.4, 3933.765,
            3955.425, 3939.67, 3861.548, 3791.704, 3842.363, 3968.042, 3937.316, 3805.664, 3761.303, 3799.393, 3748.552,
            3662.899, 3669.24, 3718.459, 3810.19, 3822.251, 3778.616, 3873.27, 3932.76, 3807.246, 3902.135, 4035.339,
            4089.437, 4095.269, 4129.357, 4116.842, 4176.233, 4155.69, 4103.348, 4054.036, 4132.298, 4072.524, 4027.142,
            3987.549, 4020.368, 4048.531, 4089.85, 4096.47, 4098.221, 4033.573, 3997.828, 3985.928, 3927.144, 3844.647,
            3859.038, 3839.164, 3800.647, 3757.499, 3785.992, 3712.214, 3764, 3644.814, 3666.249, 3675.448, 3679.626,
            3687.801, 3658.797, 3562.117, 3500.92, 3479.636, 3449.544, 3381.752, 3460.232, 3427.443, 3444.917, 3427.475,
            3435.876, 3316.159, 3241.707, 3190.221, 3267.424, 3181.759, 3127.219, 3084.76, 3224.368, 3117.636, 3078.855,
            3018.144, 3086.596, 3006.688, 2952.676, 2895.046, 2861.889, 2812.206, 2812.621, 2767.534, 2939.371,
            2858.248, 2847.714, 2834.906, 2867.476, 2807.474, 2769.758, 2695.103, 2726.913, 2709.574, 2698.159,
            2686.016, 2781.155, 2748.826, 2696.026, 2731.64, 2759.354, 2724.703, 2781.34, 2718.418, 2710.957, 2683.093,
            2667.59, 2642.046, 2697.775, 2667.438, 2648.342, 2651.274, 2644.132, 2573.827, 2561.012, 2525.153, 2513.722,
            2550.05, 2573.703, 2622.559, 2756.046, 2744.071, 2748.011, 2784.734, 2805.622, 2731.393, 2739.923, 2699.969,
            2708.636, 2719.867, 2787.156, 2775.394, 2881.653, 2956.203, 2924.03, 2913.811, 2979.708, 2966.818, 3033.366,
            3007.466, 3056.816, 3095.712, 3175.462, 3123.298, 3268.077, 3260.445, 3267.819, 3287.906, 3367.369,
            3347.786, 3387.78, 3422.416, 3434.543, 3427.693, 3500.236, 3452.452, 3498.362, 3535.573, 3667.596, 3696.777,
            3762.477, 3845.579, 3786.707, 3836.444, 3802.987, 3802.115, 3729.498, 3704.698, 3716.346, 3421.465,
            3401.183, 3473.386, 3554.782, 3583.227, 3655.634, 3552.671, 3608.758, 3708.824, 3637.135, 3588.784,
            3775.297, 3682.038, 3683.236, 3773.579, 3785.046, 3710.108, 3739.342, 3609.87, 3702.268, 3844.771, 4017.818,
            3952.153, 4035.051, 3938.745, 3986.194, 4075.787, 4189.808, 4209.805, 4247.662, 4149.91, 4057.241, 4027.919,
            3972.385, 4036.149, 4111.56, 4075.349, 4021.037, 4081.354, 4248.671, 4212.063, 4244.651, 4190.109, 4211.672,
            4171.834, 4237.408, 4104.765, 4145.869, 4333.041, 4327.792, 4283.946, 4287.3, 4186.275, 4163.186, 4233.155,
            4178.544, 4100.799, 4086.962, 3946.541, 3999.43, 3985.17, 3942.509, 3977.717, 4043.213, 3969.119, 4014.443,
            3939.468, 3939.766, 3920.23, 3918.46, 3791.482, 3902.147, 3911.994, 3999.132, 4011.537, 4075.958, 4031.945,
            4122.636, 4037.045, 3945.817, 3832.393, 3873.101, 3894.093, 4129.316, 4039.482, 3990.2, 3965.26, 4062.468,
            4006.546, 4067.234, 3964.675, 3945.534, 3942.674, 3967.723, 3913.223, 3933.683, 3844.077, 3793.232,
            3871.629, 3910.121, 3889.658, 3921.698, 3840.671, 3933.463, 3866.183, 3826.116, 3807.389, 3862.591,
            3818.571, 3879.013, 3834.379, 3879.018, 3759.131, 3786.191, 3624.729, 3648.146, 3549.286, 3710.515,
            3732.429, 3678.777, 3742.413, 3620.521, 3539.288, 3592.109, 3568.733, 3596.814, 3528.708, 3443.503,
            3557.773, 3554.618, 3542.167, 3554.555, 3600.674, 3524.679, 3542.316, 3567.898, 3472.867, 3412.685,
            3400.659, 3347.695, 3263.624, 3332.683, 3328.76, 3404.892, 3428.721, 3461.469, 3416.849, 3399.975, 3366.956,
            3359.776, 3295.539, 3275.096, 3250.22, 3319.048, 3274.467, 3257.487, 3190.916, 3128.64, 3176.165, 3184.295,
            3090.524, 3090.352, 3105.782, 3105.823, 3047.132, 3036.405, 2968.822, 2944.734, 3204.178, 3177.152,
            3235.787, 3322.294, 3209.649, 3207.811, 3079.985, 3123.422, 3088.957, 3041.51, 3062.652, 3174.009, 3072.435,
            3062.463, 3097.739, 3144.452, 3475.924, 2765.044, 2724.413, 2803.616, 2767.664, 2696.362, 2697.549,
            3088.746, 3056.302, 3004.095, 3104.333, 2355.547, 2492.639, 2883.259, 2155.807, 1894.032, 2177.195,
            2370.484, 2450.965, 2285.929, 2153.846, 1596.848, 1800.613, 2040.362, 2017.208, 1952.17, 1949.66, 2000.06,
            1987.456, 1983.908, 1961.206, 2041.025, 1528.972, 1587.588, 1710.076, 1997.929, 2057.614, 1964.319,
            1942.439, 1944.91, 1975.797, 1860.334, 1888.313, 1907.777, 1800.168, 1837.46, 1867.718, 1902.43, 1841.951,
            1876.853, 1831.268, 1830.03, 1819.475, 1812.503, 1774.513, 1939.16, 2037.155, 2034.837, 1917.939, 2002.828,
            1876.933, 1904.596, 1837.5, 1888.339, 1977.95, 2055.449, 2019.955, 2132.051, 2092.441, 2111.401, 2196.143,
            2148.692, 2182.647, 2202.685, 2071.953, 2095.421, 2115.965, 2173.369, 2172.69, 2186.575, 2243.126, 2257.337,
            2245.565, 2297.569, 2297.713, 2269.125, 2253.868, 2425.613, 2331.016, 2455.418, 2431.844, 2555.269,
            2542.926, 2561.551, 2560.015, 2607.174, 2646.852, 2731.935, 2680.58, 2657.067, 2690.096, 2773.535, 2777.382,
            2848.425, 2854.078, 2846.633, 2909.267, 2990.512, 2942.59, 3044.474, 3077.141, 3065.262, 3080.013, 3151.438,
            3132.101, 3211.188, 3296.458, 3327.841, 3371.498, 3421.42, 3361.38, 3399.011, 3396.159, 3440.391, 3497.374,
            3465.596, 3524.923, 3624.226, 3654.337, 3723.284, 3684.427, 3791.295, 3830.17, 3890.023, 3965.762, 3916.411,
            3978, 3861.874, 4022.344, 3947.746, 3993.064, 3930, 3978.489, 4233.266, 4066.424, 4128.347, 4257.647,
            4125.48, 4206.247, 4143.615, 4277.628, 4480.2, 4861.601, 4610.399, 4641.562, 5435.888, 5070.654, 5352.935,
            5356.233, 5222.234, 5062.854, 5242.134, 5412.373, 5636.585, 5915.308, 5834.665, 5764.854, 5890.095,
            5886.755, 5986.417, 5913.86, 5822.264, 5723.97, 5771.48, 5914.033, 5929.531, 5858.214, 5892.219, 6073.187,
            6109.601, 6018.868, 6100.061, 6044.959, 6105.481, 6010.866, 5916.567, 5872.979, 5805.685, 5662.547,
            5809.371, 5851.006, 5878.979, 5876.791, 5922.297, 5907.089, 5986.207, 6009.137, 6020.427, 6126.56, 6091.402,
            6048.382, 6198.626, 6244.961, 6230.664, 6083.271, 5973.197, 5871.455, 6015.447, 6148.438, 6179.83, 5914.902,
            5850.301, 5966.506, 6032.3, 6013.748, 5960.466, 5925.018, 5976.947, 5700.62, 5775.346, 5675.313, 5837.309,
            5978.719, 5944.667, 5975.914, 6043.891, 6006.842, 5935.679, 5866.815, 5885.697, 5821.684, 5910.675,
            5784.399, 5660.823, 5706.74, 5879.729, 5885.475, 5856.733, 5778.364, 5852.875, 5756.052, 5712.448, 5706.201,
            5644.289, 5570.008, 5558.403, 5480.395, 5500.523, 5510.744, 5512.153, 5485.19, 5361.23, 5235.557, 5388.875,
            5090.467, 5298.495, 5200.044, 5152.608, 5065.444, 5021.897, 4931.373, 4896.586, 4848.938, 4883.566, 4811.72,
            4718.542, 4583, 4497.562, 4541.486, 4576.064, 4518.324, 4831.611, 4641.142, 4448.936, 4411.369, 4340.537,
            4236.02, 4174.713, 4211.912, 4114.959, 4101.664, 4120.78, 4063.964, 4126.36, 4105.191, 4051.876, 4010.157,
            4010.603, 3972.024, 4040.244, 3816.064, 3815.051, 3607.55, 3609.207, 3607.327, 3726.135, 3743.125, 3605.791,
            3513.375, 3477.661, 3359.901, 3344.889, 3345.6, 3336.523, 3265.96, 3301.757, 3279.211, 3481.844, 3263.995,
            3267.955, 3213.32, 3247.594, 3160.902, 3105.091, 3058.869, 3162.462, 3062.926, 3129.608, 3109.245, 3164.344,
            3071.689, 3124.87, 3120.728, 3129.035, 3100.352, 3285.895, 3071.571, 3076.246, 3077.134, 3126.825, 3080.966,
            3152.521, 3134.675, 3204.839, 3227.279, 3311.352, 3247.853, 3237.304, 3210.654, 3167.917, 3234.698,
            3315.053, 3476.728, 3813.958, 3725.408, 3796.042, 3873.417, 4007.835, 4212.939, 4412.381, 4352.665,
            4483.175, 4706.905, 4866.691, 4950.225, 5304.656, 5703.901, 6090.905, 6361.289, 6556.039, 6678.681,
            6938.912, 6848.777, 6982.704, 6910.735, 7214.72, 7343.708, 7317.787, 7398.42, 7711.35, 7830.874, 8005.984,
            8237.472, 8282.993, 8164.573, 8150.332, 8212.895, 8362.307, 8437.696, 8346.769, 8357.021, 8304.204,
            8623.468, 9263.438, 9088.756, 9061.577, 9048.412, 9080.738, 9138.871, 9381.724, 9254.749, 8971.079,
            8995.567, 9087.055, 9285.734, 9423.906, 9279.551, 9380.546, 9395.519, 9474.372, 9391.544, 9523.044,
            9481.929, 9482.202, 9364.921, 9483.204, 9832.957, 10080.921, 10205.79, 10338.573, 10269.8, 10356.92,
            10548.773, 10255.742, 10094.49, 10232.472, 10082.463, 10107.748, 10198.444, 10133.318, 10411.598, 10372.938,
            10404.242, 10427.762, 10338.227, 10261.694, 10140.95, 10059.108, 10064.477, 10024.732, 10025.418, 10191.752,
            10389.56, 10425.584, 10204.17, 10147.118, 10164.835, 10238.315, 10009.698, 10053.182, 9869.218, 9691.712,
            9572.675, 9622.274, 9678.618, 9539.368, 9628.884, 9655.025, 9684.313, 9651.062, 9460.285, 9190.415, 9035.69,
            8784.031, 8780.818, 8754.204, 8691.86, 8651.696, 8537.748, 8526.772, 8496.859, 8542.911, 8481.873, 8452.147,
            8367.592, 8405.991, 8102.126, 8138.841, 7938.583, 7973.052, 7838.281, 7827.203, 7970.876, 7692.72, 7632.025,
            7711.138, 7595.697, 7574.841, 7570.446, 7668.956, 7637.054, 7677.782, 7657.205, 7534.473, 7511.121,
            7431.348, 7295.944, 7264.521, 7137.312, 7195.069, 7262.309, 7090.653, 7168.135, 7352.549, 7385.478,
            7174.528, 7008.343, 6886.15, 6868.49, 6875.356, 6890.56, 6874.079, 6814.475, 6765.543, 6783.048, 6906.248,
            6850.398, 6889.398, 6690.111, 6713.081, 6552.73, 6565.829, 6666.459, 6780, 6865.388, 6841.659, 6644.638,
            6588.094, 6628.955, 6634.066, 6523.931, 6612.778, 6608.967, 6644.413, 6510.828, 6450.456, 6462.972,
            6532.923, 6486.788, 6371.261, 6339.059, 6294.016, 6271.096, 6206.817, 6133.887, 6274.751, 6205.133,
            6187.166, 6172.229, 6014.569, 5953.607, 5879.417, 5828.648, 5898.174, 5852.809, 5813.769, 5823.52, 5851.783,
            5597.081, 5571.945, 5609.802, 5463.891, 5332.291, 5360.424, 5244.131, 5183.105, 5189.246, 5032.168,
            4962.408, 5124.705, 4888.117, 4829.815, 4815.873, 4820.051, 4778.339, 4745.429, 4595.251, 4684.03, 4495.828,
            4457.092, 4469.545, 4558.276, 4568.712, 4463.145, 4513.271, 4440.007, 4323.81, 4350.645, 4259.491, 4203.442,
            4063.877, 4054.201, 3985.925, 4173.311, 4137.731, 4014.29, 3956.447, 3872.217, 3851.399, 3917.145, 3924.214,
            3889.546, 3873.465, 3877.328, 3832.195, 3957.256, 3743.19, 3698.756, 3851.59, 3706.522, 3715.838, 3746.685,
            3622.785, 3586.283, 3590.02, 3564.321, 3523.965, 3591.07, 3521.56, 3625.734, 3666.04, 3811.606, 3747,
            3823.462, 3702.372, 3558.934, 3520.641, 3592.43, 3623.361, 3731.433, 3612.468, 3537.373, 3610.918, 3720.025,
            3580.268, 3695.425, 3723.266, 3697.745, 3755.217, 3925.751, 4022.807, 4226.97, 4050.335, 4196.623, 4325.814,
            4498.604, 4609.281, 4708.767, 4816.768, 4997.592, 5203.505, 5470.377, 5543.918, 5896.421, 6105.328,
            6268.047, 6681.549, 7007.497, 7319.45, 7478.89, 7451.177, 7505.286, 7464.154, 7484.158, 7518.503, 7627.435,
            7765.789, 7970.451, 8185.079, 8410.277, 8336, 8563.775, 8527.473, 8448.202, 8351.021, 8533.898, 8435.408,
            8705.541, 8662.081, 8675.416, 8707.365, 9034.623, 9126.111, 9140.108, 9287.086, 9576.057, 9456.574,
            9684.655, 9451.063, 9647.952, 9817.625, 9899.123, 9791.923, 9754.674, 9963.275, 10110.214, 9969.085,
            9995.963, 9906.781, 9932.199, 9798.098, 9890.241, 10019.448, 10044.868, 10024.718, 10338.746, 10338.661,
            10670.687, 10553.856, 10312.706, 10372.829, 10643.903, 10452.645, 10486.379, 10252.49, 10267.683, 10368.204,
            10396.585, 10273.374, 10343.115, 10269.305, 10295.801, 10232.075, 10224.615, 10231.124, 10155.938,
            10052.297, 10081.642, 10095.999, 10391.154, 10517.938, 10458.032, 10193.142, 10036.555, 10017.142, 9946.213,
            9747, 9738.948, 9591.046, 9581.886, 9560.121, 9574.137, 9241.903, 9255.787, 9326.06, 9196.556, 9037.775,
            8997.519, 8862.132, 8877.021, 8634.34, 8505.718, 8428.71, 8527.958, 8166.786, 8138, 8049.537, 7904.609,
            7989.916, 8151.718, 7941.992, 7935.495, 8050.589, 7834.413, 7629.486, 7777.063, 7845.052, 7891.854,
            7746.202, 7464.83, 7320.625, 7260.26, 7269.503, 7286.711, 7228.413, 7143.779, 7054.381, 7081.367, 6905.62,
            7082.813, 7061.334, 7004.958, 6865.477, 6952.896, 6962.938, 7197.022, 7092.861, 6989.524, 6864.731,
            6710.296, 6968.238, 6961.421, 6799.571, 6814.532, 6799.564, 6852.242, 7018.421, 7036.353, 6978.46, 6870.102,
            6573.636, 6542.833, 6512.548, 6708.078, 6556.757, 6456.401, 6503.456, 6544.385, 6452.073, 6407.07, 6411.557,
            6620.478, 6820.01, 6750.873, 6660.037, 6740.74, 6688.811, 6659.282, 6635.145, 6629.432, 6654.017, 6723.908,
            6659.136, 6645.955, 6742.672, 6742.294, 6653.574, 6588.913, 6458.521, 6367.521, 6329.668, 6347.491,
            6388.838, 6483.323, 6320.209, 6269.472, 6065.652, 6018.585, 6059.424, 6106.456, 6009.724, 5986.409,
            5997.116, 6088.092, 5961.321, 6055.59, 5947.258, 5917.852, 5882.824, 5823.996, 5764.78, 5701.973, 5673.993,
            5654.895, 5610.203, 5567.104, 5486.369, 5621.265, 5437.17, 5470.167, 5500.999, 5361.942, 5337.61, 5346.415,
            5343.481, 5106.368, 4882.496, 4943.35, 4938.239, 4953.659, 4902.05, 4828.124, 4911.548, 4839.014, 4949.851,
            4976.631, 4713.093, 4558.304, 4513.053, 4608.401, 4532.15, 4696.389, 4542.123, 4397.217, 4293.02, 4298.967,
            4273.594, 4347.727, 4322.179, 4257.677, 4185.993, 4243.736, 4235.964, 4402.076, 4188.9, 4192.902, 4047.667,
            4172.604, 4084.211, 4122.557, 4028.179, 3922.617, 3900.906, 3963.086, 3951.067, 3987.158, 3876.023,
            3765.718, 3791.802, 3790.689, 3757.78, 3864.669, 3765.645, 3706.814, 3602.968, 3692.731, 3802.612, 3872.447,
            3807.618, 3749.837, 3856.351, 3886.359, 3896.819, 3936.189, 3854.6, 3882.938, 3890.729, 3948.868, 4008.542,
            4251.829, 4204.645, 4241.858, 4379.624, 4441.1, 4514.695, 4811.096, 4941.915, 5170.531, 5356.496, 5566.085,
            5596.037, 5768.917, 5963.852, 6204.019, 6581.674, 6749.663, 6902.949, 7312.355, 7484.298, 7574.8, 7657.099,
            7756.07, 7668.868, 7875.264, 7899.741, 7991.311, 8183.111, 8384.648, 8272.376, 8429.634, 8574.809, 7630.201,
            8242.917, 9101.204, 8607.054, 8550.619, 8558.643, 8685.534, 8983.722, 9025.15, 8981.533, 8936.963, 9005.411,
            9529.81, 9700.703, 9787.903, 9743.146, 7159.111, 6570.123, 6430.679, 6582.554, 6602.991, 6609.517, 6648.464,
            6760.994, 9371.524, 9915.632, 9683.547, 9450.154, 9373.484, 9342.25, 9446.478, 9625.448, 9696.369, 9436.057,
            9952.369, 10213.784, 9991.095, 9854.579, 10048.892, 10028.096, 10117.286, 10055.824, 9833.402, 9888.613,
            10147.564, 10355.724, 10355.503, 10438.525, 10381.808, 10242.064, 8209.795, 7512.177, 7135.089, 7197.275,
            7171.19, 7151.134, 7088.338, 7090.38, 6968.069, 6827.697, 6796.773, 6865.248, 6873.056, 6725.694, 6681.021,
            6530.784, 6506.723, 6519.631, 6582.308, 6548.13, 6571.652, 6503.707, 6366.467, 6249.608, 6233.44, 6095.73,
            6032.987, 5970.237, 5972.553, 5876.831, 5835.182, 5902.455, 5942.279, 5660.117, 5584.279, 5587.521,
            5620.939, 5582.254, 5607.901, 5371.101, 5318.217, 5258.654, 5220.216, 5195.177, 5241.602, 5111.526,
            5204.067, 5187.887, 5108.8, 5047.496, 5100.7, 5049.589, 5137.912, 5140.218, 5152.973, 5114.136, 4991.311,
            4897.479, 4938.574, 4937.071, 4828.14, 4893.761, 5166.26, 5058.783, 5005.938, 5085.119, 5032.239, 5010.917,
            4958.216, 4652.777, 4439.094, 4457.666, 4402.996, 4381.081, 4436.692, 4349.111, 4427.944, 4533.401,
            4596.008, 4606.635, 4698.115, 4579.522, 4399.995, 4372.741, 4441.833, 4445.203, 4489.019, 4394.521,
            4382.923, 4378.638, 4469.043, 4364.2, 4351.905, 4350.568, 4299.361, 4224.164, 4353.871, 4271.569, 4331.561,
            4209.074, 4293.208, 4301.966, 4304.488, 4329.69, 4297.664, 4218.528, 4151.137, 4053.197, 4028.783, 3960.512,
            3981.224, 3956.881, 3906.712, 4031.973, 4032.518, 3854.583, 3974.36, 3845.056, 3802.464, 3839.406, 3746.018,
            3687.992, 3785.316, 3721.37, 3569.551, 3495.497, 3451.341, 3409.877, 3331.149, 3202.502, 3199.386, 3112.43,
            3109.217, 3124.99, 3258.38, 3155.216, 3105.462, 3004.438, 2921.904, 2930.849, 3003.461, 2863.773, 2857.207,
            2769.962, 2831.838, 2830.566, 2861.454, 2839.2, 2796.548, 2828.244, 2782.084, 2738.827, 2815.699, 2676.074,
            2701.668, 2627.252, 2583.433, 2553.138, 2653.738, 2601.122, 2533.15, 2586.397, 2467.909, 2431.307, 2432.016,
            2402.463, 2371.698, 2332.55, 2311.558, 2296.403, 2434.366, 2329.972, 2294.981, 2338.9, 2301.863, 2295.582,
            2320.915, 2288.896, 2245.302, 2230.656, 2209.184, 2331.024, 2411.362, 2443.089, 2443.65, 2438.823, 2528.512,
            2491.003, 2541.159, 2433.518, 2409.25, 2417.583, 2414.99, 2394.038, 2432.554, 2430.96, 2421.955, 2465.196,
            2510.071, 2495.701, 2538.687, 2511.336, 2597.076, 2608.783, 2682.6, 2728.908, 2889.894, 2886.805, 2905.515,
            2982.607, 3080.9, 3090.614, 3311.536, 3358.369, 3472.384, 3656.095, 3786.82, 3814.399, 4042.431, 4222.834,
            4425.571, 4520.703, 4781.153, 4937.727, 5244.137, 5274.828, 5371.378, 5407.037, 5475.504, 5513.441,
            5718.166, 5820.892, 5780.288, 5835.481, 6110.462, 6134.635, 6173.436, 6241.585, 6147.959, 6264.3, 6217.69,
            6083.212, 6078.222, 6097.32, 6176.227, 6342.227, 6543.679, 6500.828, 6796.777, 6661.459, 6798.18, 6855.345,
            6733.4, 6752.904, 6653.114, 6651.474, 6793.627, 6697.119, 6830.008, 6711.391, 6795.449, 6796.928, 6792.423,
            6752.225, 6739.464, 6596.106, 6637.357, 6553.812, 6559.179, 6651.224, 6801.902, 6823.129, 6877.417,
            7033.261, 6996.765, 6990.304, 6925.033, 6944.098, 6938.433, 6929.099, 7048.229, 7105.462, 7096.382,
            7226.521, 7065.314, 6964.269, 7127.403, 7158.024, 7097.587, 7057.687, 7011.148, 6979.312, 7036.191,
            6973.561, 7043.285, 6951.884, 6912.904, 7012.609, 6979.54, 6924.781, 6931.346, 6611.508, 6549.472, 6651.426,
            6378.024, 6368.216, 6510.83, 6350.109, 6179.441, 6258.48, 6432.534, 6287.171, 6267.671, 6129.993, 6071.135,
            5811.851, 5894.287, 5781.836, 5684.025, 5732.253, 5843.511, 5792.007, 5637.909, 5560.567, 5481.289, 5457.45,
            5434.919, 5443.649, 5265.096, 5222.307, 5240.941, 5151.27, 5251.104, 5236.875, 5107.203, 5082.685, 5219.129,
            5117.148, 5120.561, 5126.019, 5045.278, 5013.277, 5001.531, 4938.101, 5022.033, 4989.385, 5034.955,
            4816.765, 4723.134, 4817.486, 4832.838, 4751.285, 4599.859, 4618.175, 4649.788, 4525.368, 4661.051, 4512.56,
            4487.913, 4427.558, 4410.843, 4360.255, 4395.761, 4425.425, 4404.82, 4367.407, 4416.191, 4304.639, 4369.911,
            4289.563, 4190.731, 4121.461, 4297.135, 4267.056, 4244.741, 4264.254, 4279.08, 4234.433, 4224.362, 4191.239,
            4229.372, 4135.7, 4060.292, 4028.237, 4044.126, 3986.22, 4027.453, 3965.791, 4028.654, 4001.911, 4010.888,
            4017.907, 3996.384, 3951.473, 3899.995, 3795.574, 3843.093, 3794.245, 3779.583, 3779.468, 3718.44, 3696.549,
            3649.594, 3605.126, 3740.203, 3629.695, 3569.05, 3525.287, 3507.648, 3489.205, 3525.434, 3498.706, 3489.29,
            3472.735, 3380.222, 3306.976, 3258.628, 3253.646, 3186.563, 3178.26, 3149.497, 3101.263, 3181.08, 3104.419,
            2983.881, 2905.886, 2880.548, 2820.075, 2863.989, 2826.015, 2838.148, 2783.505, 2756.472, 2762.099,
            2820.496, 2715.835, 2667.87, 2638.443, 2673.393, 2674.193, 2716.507, 2591.799, 2589.542, 2524.667, 2542.379,
            2504.092, 2544.325, 2475.503, 2426.045, 2410.752, 2425.549, 2398.354, 2399.959, 2385.018, 2360.057,
            2311.877, 2310.739, 2253.745, 2349.747, 2274.721, 2303.058, 2259.682, 2273.041, 2234.068, 2281.109,
            2203.462, 2192.088, 2170.068, 2167.638, 2171.789, 2288.881, 2239.112, 2156.665, 2149.717, 2199.177,
            2221.959, 2219.581, 2125.985, 2095.74, 2104.933, 2135.582, 2189.26, 2263.745, 2198.235, 2193.825, 2230.809,
            2363.087, 2366.368, 2448.289, 2519.448, 2444.751, 2478.412, 2530.219, 2564.474, 2750.504, 2726.043,
            2731.828, 2861.261, 3054.171, 3116.291, 3278.475, 3312.134, 3382.829, 3455.366, 3653.619, 3758.921,
            3958.338, 4210.566, 4335.673, 4537.396, 4723.964, 4814.083, 5068.664, 5140.651, 5179.375, 5254.907,
            5362.887, 5326.145, 5347.117, 5376.382, 5369.729, 5718.383, 5861.955, 5646.644, 5874.163, 5758.587,
            5822.916, 5724.67, 5993.331, 5845.687, 5868.528, 5864.162, 5848.723, 5975, 6191.489, 6310.356, 6674.859,
            6764.544, 6556.518, 6631.312, 6297.486, 6212.627, 6036.964, 6229.903, 6121.13, 6037.34, 6116.268, 6138.256,
            6205.238, 6328.568, 6338.841, 6381.196, 6544.081, 6248.407, 6156.097, 6154.236, 6193.331, 6153.476, 4894.37,
            5616.327, 5949.52, 6118.773, 6174.234, 6231.687, 6346.794, 6179.059, 6186.148, 6229.065, 6295.872, 6455.584,
            6695.234, 6582, 6618.434, 6457.325, 6554.356, 6436.366, 6652.302, 6527.989, 6627.048, 6715.132, 6669.859,
            6708.03, 6511.403, 6453.957, 6641.085, 6535.906, 6546.013, 6349.836, 6218.394, 6044.99, 6121.751, 5942.698,
            5807.813, 5806.935, 5762.774, 5592.686, 5589.147, 5559.692, 5451.468, 5427.881, 5307.589, 5138.428,
            5098.619, 5034.116, 4835.458, 4689.895, 4803.273, 4738.727, 4567.185, 4570.1, 4553.723, 4469.383, 4421.726,
            4388.581, 4462.921, 4366.402, 4536.84, 4597.231, 4343.703, 4191.136, 4323.29, 4212.515, 4269.892, 4210.189,
            4260.931, 4217.32, 4301.777, 4228.346, 4305.855, 4273.558, 4277.79, 4231.796, 4209.846, 4219.251, 4230.12,
            4258.061, 4419.317, 4477.576, 4432.809, 4205.619, 4144.86, 4158.539, 4183.676, 4117, 4174.557, 4088.398,
            4073.26, 4051.459, 4098.511, 4035.918, 4184.964, 4150.068, 4125.923, 4042.781, 4034.173, 3951.331, 4002.826,
            3848.692, 3908.73, 3793.776, 3891.667, 3817.261, 3962.691, 3905.356, 3903.127, 3908.522, 3921.411, 3967.791,
            3928.897, 3922.735, 3932.728, 3823.973, 3752.653, 3743.214, 3878.524, 3806.034, 3777.398, 3943.531,
            3920.197, 3810.818, 3836.68, 3831.219, 3759.022, 3734.96, 3781.552, 3681.305, 3653.367, 3564.665, 3529.121,
            3561.833, 3592.753, 3568.294, 3604.118, 3511.404, 3496.537, 3477.594, 3519.641, 3566.907, 3619.604,
            3545.919, 3580.011, 3507.3, 3463.601, 3359.582, 3391.929, 3364.103, 3344.854, 3265.992, 3230.704, 3208.588,
            3254.183, 3192.484, 3130.113, 3166.313, 3085.524, 3017.947, 3111.564, 3057.035, 3024.072, 2936.645,
            2974.818, 3005.528, 3066.679, 3017.318, 2976.698, 2959.047, 2952.356 };
    return new TimeSeries(new TimePeriod(TimeUnit.MONTH, 1),
            OffsetDateTime.of(LocalDateTime.of(2004, 11, 19, 0, 0), ZoneOffset.ofHours(0)), traffic);
  }

}
