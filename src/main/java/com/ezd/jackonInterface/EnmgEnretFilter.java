package com.ezd.jackonInterface;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Administrator on 2017/5/9.
 */
@JsonIgnoreProperties({"ezdPostOne","ezdPostTwo","ezdRetType","ezdEnmg","ezdNewsStatus","ezdErlenrets","ezdUmgs"})
public interface EnmgEnretFilter {
}
