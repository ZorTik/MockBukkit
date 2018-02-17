package be.seeseemelk.mockbukkit.block;

import static org.junit.Assert.*;

import org.bukkit.Material;
import org.junit.Before;
import org.junit.Test;

public class BlockMockTest
{
	private BlockMock block;

	@Before
	public void setUp() throws Exception
	{
		block = new BlockMock();
	}

	@Test
	public void getType_Default_Air()
	{
		assertEquals(Material.AIR, block.getType());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void getTypeId_TypeSet_TypeGotten()
	{
		assertEquals(Material.AIR.getId(), block.getTypeId());
		block.setType(Material.STONE);
		assertEquals(Material.STONE.getId(), block.getTypeId());
	}
	
	@Test
	public void setType_Stone_Set()
	{
		block.setType(Material.STONE);
		assertEquals(Material.STONE, block.getType());
	}
	
	@Test
	public void getState_Default_NotNull()
	{
		assertNotNull(block.getState());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void getData_DataSet_DateGotten()
	{
		block.setData((byte) 25);
		assertEquals(25, block.getData());
	}

}
