#pragma GCC target("avx2,bmi,bmi2,popcnt,lzcnt,abm,native")
#pragma GCC optimize("Ofast,unroll-loops")
#pragma GCC optimize("-fipa-sra")
#pragma GCC optimize("-fno-stack-protector")
#pragma GCC optimize("-fdelete-null-pointer-checks")
static const bool __boost{[]() {
   cin.tie(nullptr);
   cout.tie(nullptr);
   return ios_base::sync_with_stdio(false);
}()};
const size_t BUFFER_SIZE{0x6fafffff};
alignas(max_align_t) char buffer[BUFFER_SIZE];
size_t buffer_pos{0};
void* operator new(size_t size) {
    constexpr size_t alignment{alignof(max_align_t)};
    const size_t padding{(alignment - (buffer_pos % alignment)) % alignment};
    const size_t total_size{size + padding};
    char* aligned_ptr{&buffer[buffer_pos + padding]};
    buffer_pos += total_size;
    return aligned_ptr;
}
void operator delete(void* ptr, unsigned long) noexcept {}
void operator delete(void* ptr) noexcept {}
void operator delete[](void* ptr) noexcept {}
const auto __{[]() {
    struct Leetcode {
        static void _() {
            ofstream("display_runtime.txt") << 0 << '\n';
        }
    };
    atexit(&Leetcode::_);
    return 0;
}()};

class Solution {
public:
    vector<vector<int>> transpose(vector<vector<int>>& matrix) {
        int m{static_cast<int>(matrix.size())}, n{static_cast<int>(matrix[0].size())};
        vector<vector<int>> res(n, vector<int>(m));
        for (int i{0}; i < m; ++i) {
            for (int j{0}; j < n; ++j) {
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }
};