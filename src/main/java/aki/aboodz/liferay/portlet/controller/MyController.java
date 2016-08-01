package aki.aboodz.liferay.portlet.controller;

import aki.aboodz.liferay.portlet.util.PortletModeNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

@Controller
@RequestMapping(PortletModeNames.VIEW)
public class MyController {

    private final String VIEW_NAME = "hello";
    @RenderMapping
    public ModelAndView hello(RenderRequest request, RenderResponse response)  {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("author", "Aboodz");
        modelAndView.setViewName(VIEW_NAME);
        return modelAndView;
    }

}
