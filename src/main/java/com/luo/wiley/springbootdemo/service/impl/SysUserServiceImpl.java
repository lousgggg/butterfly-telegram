package com.luo.wiley.springbootdemo.service.impl;

import com.luo.wiley.springbootdemo.mapper.SysUserMapper;
import com.luo.wiley.springbootdemo.domain.SysUser;
import com.luo.wiley.springbootdemo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * (SysUser)表服务实现类
 *
 * @author makejava
 * @since 2020-11-21 20:55:44
 */
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserMapper sysUserMapper;
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysUser queryById(String id) {
        SysUser sysUser = this.sysUserMapper.queryById(id);

        BigDecimal a = new BigDecimal("0.11");


        int[] numbers = new int[]{3, 2, 7, 4, 5, 6, 9, 8, 0, 1};
        redisTemplate.opsForValue().set("before", Arrays.toString(numbers));
        String s = new String();
        s.length();
        int[] nu = new int[10];
        int length = nu.length;
        int[] result = quickSort(numbers);
        redisTemplate.opsForValue().set("after", Arrays.toString(result));
        System.out.println(Arrays.toString(result));
        return sysUser;
    }

    private int[] quickSort(int[] numbers) {
        if (numbers != null) {
            for (int i = 0; i < numbers.length; i++) {
                for (int j = numbers.length - 1; j > 0; j--) {
                    if (i < j && numbers[i] > numbers[j]) {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
        }
        return numbers;
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<SysUser> queryAllByLimit(int offset, int limit) {
        return this.sysUserMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    @Override
    public SysUser insert(SysUser sysUser) {
        this.sysUserMapper.insert(sysUser);
        return sysUser;
    }

    /**
     * 修改数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    @Override
    public SysUser update(SysUser sysUser) {
        this.sysUserMapper.update(sysUser);
        return this.queryById(sysUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.sysUserMapper.deleteById(id) > 0;
    }
}