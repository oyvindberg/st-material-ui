package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Enter
import com.olvind.mui.muiMaterial.anon.Exit
import com.olvind.mui.react.mod.CSSProperties
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionsUtilsMod {
  
  @JSImport("@mui/material/transitions/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTransitionProps(props: ComponentProps, options: Options): TransitionProps = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionProps")(props.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TransitionProps]
  
  inline def reflow(node: Element): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("reflow")(node.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait ComponentProps extends StObject {
    
    var easing: js.UndefOr[String | Enter] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var timeout: Double | Exit
  }
  object ComponentProps {
    
    inline def apply(timeout: Double | Exit): ComponentProps = {
      val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentProps] (val x: Self) extends AnyVal {
      
      inline def setEasing(value: String | Enter): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTimeout(value: Double | Exit): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var mode: "enter" | "exit"
  }
  object Options {
    
    inline def apply(mode: "enter" | "exit"): Options = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setMode(value: "enter" | "exit"): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransitionProps extends StObject {
    
    var delay: js.UndefOr[String] = js.undefined
    
    var duration: String | Double
    
    var easing: js.UndefOr[String] = js.undefined
  }
  object TransitionProps {
    
    inline def apply(duration: String | Double): TransitionProps = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransitionProps] (val x: Self) extends AnyVal {
      
      inline def setDelay(value: String): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDuration(value: String | Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    }
  }
}
