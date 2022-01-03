package com.olvind.mui.muiMaterial

import org.scalajs.dom.Node
import org.scalajs.dom.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useScrollTriggerUseScrollTriggerMod {
  
  @JSImport("@mui/material/useScrollTrigger/useScrollTrigger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Boolean]
  @scala.inline
  def default(options: UseScrollTriggerOptions): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @js.native
  trait UseScrollTriggerOptions extends StObject {
    
    var disableHysteresis: js.UndefOr[Boolean] = js.native
    
    var target: js.UndefOr[Node | Window] = js.native
    
    var threshold: js.UndefOr[Double] = js.native
  }
  object UseScrollTriggerOptions {
    
    @scala.inline
    def apply(): UseScrollTriggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseScrollTriggerOptions]
    }
    
    @scala.inline
    implicit class UseScrollTriggerOptionsMutableBuilder[Self <: UseScrollTriggerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableHysteresis(value: Boolean): Self = StObject.set(x, "disableHysteresis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableHysteresisUndefined: Self = StObject.set(x, "disableHysteresis", js.undefined)
      
      @scala.inline
      def setTarget(value: Node | Window): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
}
