package cn.bugstack.springframework.context.event;

import cn.bugstack.springframework.context.ApplicationEvent;
import cn.bugstack.springframework.context.ApplicationListener;

public interface ApplicationEventMulticaster {

    /**
     * Add a listener to be notified of all events.
     * @param listener the listener to add 添加监听
     */
    void addApplicationListener(ApplicationListener<?> listener);

    /**
     * Remove a listener from the notification list.
     * @param listener the listener to remove 删除监听
     */
    void removeApplicationListener(ApplicationListener<?> listener);

    /**
     * Multicast the given application event to appropriate listeners.
     * @param event the event to multicast 广播事件
     */
    void multicastEvent(ApplicationEvent event);

}
