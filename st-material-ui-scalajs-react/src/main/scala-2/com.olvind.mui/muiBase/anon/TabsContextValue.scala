package com.olvind.mui.muiBase.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabsContextValue extends StObject {
  
  def getRootProps(): js.Object = js.native
  
  var tabsContextValue: Direction = js.native
}
object TabsContextValue {
  
  @scala.inline
  def apply(getRootProps: CallbackTo[js.Object], tabsContextValue: Direction): TabsContextValue = {
    val __obj = js.Dynamic.literal(getRootProps = getRootProps.toJsFn, tabsContextValue = tabsContextValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsContextValue]
  }
  
  @scala.inline
  implicit class TabsContextValueMutableBuilder[Self <: TabsContextValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetRootProps(value: CallbackTo[js.Object]): Self = StObject.set(x, "getRootProps", value.toJsFn)
    
    @scala.inline
    def setTabsContextValue(value: Direction): Self = StObject.set(x, "tabsContextValue", value.asInstanceOf[js.Any])
  }
}
