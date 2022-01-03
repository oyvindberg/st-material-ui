package com.olvind.mui.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactElement extends StObject {
  
  var key: Key | Null = js.native
  
  var props: Any = js.native
  
  var `type`: Any = js.native
}
object ReactElement {
  
  @scala.inline
  def apply(props: Any, `type`: Any): ReactElement = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactElement]
  }
  
  @scala.inline
  implicit class ReactElementMutableBuilder[Self <: ReactElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNull: Self = StObject.set(x, "key", null)
    
    @scala.inline
    def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
