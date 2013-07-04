package design.observer;

/**
 * @Description: Game observer
 * @Author     : lzh kojavaee@qq.com
 * @Date       : 2013-07-02
 *
 */
public interface IGameObserver {
	public void registerObserver(IGameListener game);
	public void removeObserver(IGameListener game);
	public void notifyListener();
}
