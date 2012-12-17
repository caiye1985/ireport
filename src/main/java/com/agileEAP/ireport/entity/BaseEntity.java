package com.agileEAP.ireport.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * 缁熶竴瀹氫箟id鐨別ntity鍩虹被.
 * 
 * 鍩虹被缁熶竴瀹氫箟id鐨勫睘鎬у悕绉般�鏁版嵁绫诲瀷銆佸垪鍚嶆槧灏勫強鐢熸垚绛栫暐.
 * Oracle闇�姣忎釜Entity鐙珛瀹氫箟id鐨凷EQUCENCE鏃讹紝涓嶇户鎵夸簬鏈被鑰屾敼涓哄疄鐜颁竴涓狪dable鐨勬帴鍙ｃ�
 * 
 * @author calvin
 */
//JPA 鍩虹被鐨勬爣璇�
@MappedSuperclass
public abstract class BaseEntity {

	protected Long id;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
