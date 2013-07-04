package design.observer;

/**
 * @Description: Game listener
 * @Author     : lzh kojavaee@qq.com
 * @Date       : 2013-07-02
 *
 */
public interface IGameListener {
	/**
     * 游戏开始
     * @param firstBidPosition
     */
    void onNewGame(int firstBidPosition);
}
